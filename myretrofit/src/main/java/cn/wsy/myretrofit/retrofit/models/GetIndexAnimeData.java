package cn.wsy.myretrofit.retrofit.models;

/**
 * Created by wsy on 2016/8/19.
 */
public class GetIndexAnimeData {

    private String page;

    public GetIndexAnimeData() {
    }

    public GetIndexAnimeData(String page) {
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
