package cn.wsy.myretrofit.retrofit.apiservers;

import com.squareup.okhttp.RequestBody;

import cn.wsy.myretrofit.retrofit.models.IndexAnimeBean;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by wsy on 2016/8/19.
 */
public interface IndexAnimeDataService {

    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
    @POST("animeServer/servlet/GetIndexAnimeData")
    Call<IndexAnimeBean.GetIndexAnimeDataRsp> listRepos(@Body RequestBody route);
}
