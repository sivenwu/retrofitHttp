package cn.wsy.myretrofit.retrofit.activitys;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;

import cn.wsy.myretrofit.R;
import cn.wsy.myretrofit.annotation.InjectActivity;
import cn.wsy.myretrofit.annotation.LayouyInject;
import cn.wsy.myretrofit.annotation.ViewInject;
import cn.wsy.myretrofit.retrofit.apiservers.IndexAnimeDataService;
import cn.wsy.myretrofit.retrofit.models.GetIndexAnimeData;
import cn.wsy.myretrofit.retrofit.models.IndexAnimeBean;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by wsy on 2016/8/19.
 */

@LayouyInject(R.layout.activity_retrofit)
public class RetrofitActivity extends InjectActivity {

    @ViewInject(R.id.http_btn)
    private Button httpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViewListener();
    }

    private void bindViewListener() {
        httpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                httpTest();
            }
        });
    }

    private void httpTest() {
        // 2.0
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://wusyru.duapp.com")
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        IndexAnimeDataService service = retrofit.create(IndexAnimeDataService.class);
        String json = new Gson().toJson(new GetIndexAnimeData("1"));
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),json );
        Call<IndexAnimeBean.GetIndexAnimeDataRsp> call = service.listRepos(body);
        call.enqueue(new Callback<IndexAnimeBean.GetIndexAnimeDataRsp>() {
            @Override
            public void onResponse(Response<IndexAnimeBean.GetIndexAnimeDataRsp> response, Retrofit retrofit) {
                Log.i("wusy","");
            }

            @Override
            public void onFailure(Throwable t) {
                Log.i("wusy","");
            }
        });
    }
}
