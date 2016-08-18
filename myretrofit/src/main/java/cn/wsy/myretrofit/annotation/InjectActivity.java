package cn.wsy.myretrofit.annotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by wsy on 2016/8/18.
 */
public class InjectActivity extends AppCompatActivity {

    private int mLayoutId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayInjectLayout();
        displayInjectView();
    }

    /**
     * 解析注解view id
     */
    private void displayInjectView() {
        if (mLayoutId <=0){return ;}
        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();//获得声明的成员变量
        for (Field field : fields) {
            //判断是否有注解
            try {
                if (field.getAnnotations() != null) {
                    if (field.isAnnotationPresent(ViewInject.class)) {//如果属于这个注解
                        //为这个控件设置属性
                        field.setAccessible(true);//允许修改反射属性
                        ViewInject inject = field.getAnnotation(ViewInject.class);
                        field.set(this, this.findViewById(inject.value()));
                    }
                }
            } catch (Exception e) {
//                throw new InterruptedException("not found view id!");
                Log.e("wusy", "not found view id!");
            }
        }
    }

    /**
     * 注解布局Layout id
     */
    private void displayInjectLayout() {
        Class<?> clazz = this.getClass();
        if (clazz.getAnnotations() != null){
            if (clazz.isAnnotationPresent(LayouyInject.class)){
                LayouyInject inject = clazz.getAnnotation(LayouyInject.class);
                mLayoutId = inject.value();
                setContentView(mLayoutId);
            }
        }

    }
}
