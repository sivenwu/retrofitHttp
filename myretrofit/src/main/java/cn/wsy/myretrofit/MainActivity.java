package cn.wsy.myretrofit;

import android.os.Bundle;
import android.widget.TextView;

import cn.wsy.myretrofit.annotation.InjectActivity;
import cn.wsy.myretrofit.annotation.LayouyInject;
import cn.wsy.myretrofit.annotation.ViewInject;

@LayouyInject(R.layout.activity_main)
public class MainActivity extends InjectActivity {

    @ViewInject(R.id.textview)
    private TextView textView;

    @ViewInject(R.id.textview1)
    private TextView textview1;

    @ViewInject(R.id.textview2)
    private TextView textview2;

    @ViewInject(R.id.textview3)
    private TextView textview3;

    @ViewInject(R.id.textview4)
    private TextView textview4;

    @ViewInject(R.id.textview5)
    private TextView textview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        textView.setText("OK");
        textview1.setText("OK1");
        textview2.setText("OK2");
        textview3.setText("OK3");
        textview4.setText("OK4");
        textview5.setText("OK5");

    }

}
