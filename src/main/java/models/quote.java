package models;

public class quote {
    private long id;
    private authors author;
    private String content;



    public quote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public authors getAuthor() {
        return author;
    }

    public void setAuthor(authors author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
