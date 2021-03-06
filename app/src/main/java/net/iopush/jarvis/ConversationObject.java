package net.iopush.jarvis;



public class ConversationObject {
    private String name;
    private String text;

    public ConversationObject(String name, String text) {
        this.text = text;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }
}