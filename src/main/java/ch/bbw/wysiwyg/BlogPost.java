package ch.bbw.wysiwyg;

public class BlogPost {

    private String title;
    private String message;

    public String getMessage() {
        return message;
    }
    public String getTitle() {
        return title;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)",
                title,
                message.length()>20 ? message.substring(0,20) : message);
    }
}