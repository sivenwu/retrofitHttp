package cn.wsy.myretrofit.retrofit.models;

import java.util.List;

/**
 * 首页数据
 * Created by wsy on 2016/1/15.
 */
public class IndexAnimeBean {

    private String title;
    private String headimg;
    private String href;

    public IndexAnimeBean() {
    }

    public IndexAnimeBean(String title, String headimg, String href) {
        this.title = title;
        this.headimg = headimg;
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public static class GetIndexAnimeDataRsp extends BaseRsp {

        private List<IndexAnimeBean> data;

        public GetIndexAnimeDataRsp() {
        }

        /**
         * @return the data
         */
        public List<IndexAnimeBean> getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(List<IndexAnimeBean> data) {
            this.data = data;
        }


    }

}
