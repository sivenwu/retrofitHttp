package cn.wsy.myretrofit.retrofit.models;

/**
 * Created by wsy on 2016/1/22.
 */
public class InformaitionBean {

    private String title;
    private String imglink ;
    private String date;
    private String from;
    private String url;


    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     *
     */
    public InformaitionBean() {
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the imglink
     */
    public String getImglink() {
        return imglink;
    }
    /**
     * @param imglink the imglink to set
     */
    public void setImglink(String imglink) {
        this.imglink = imglink;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }
    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

}
