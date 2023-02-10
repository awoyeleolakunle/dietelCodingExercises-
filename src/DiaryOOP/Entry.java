package DiaryOOP;

import java.time.LocalDateTime;

public class Entry {

    private String title;
    private String body;
    private LocalDateTime dateTime;
    private int id;


    public Entry(String title, String body, int id){
        this.title = title;
        this.body = body;
        this.dateTime = dateTime;
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){

        return String.format("""
                Title: %s%n
                Body: %s%n
                id: %s
                """, title,body,id);
    }
}
