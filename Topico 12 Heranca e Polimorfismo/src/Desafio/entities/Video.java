package Desafio.entities;

public class Video extends Lesson{
    private String url;
    private Integer seconds;

    public Video() {
        super();
    }

    public Video(String tittle, String url, Integer seconds) {
        super(tittle);
        this.url = url;
        this.seconds = seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public int duration() {
        return seconds;
    }
}
