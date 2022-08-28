package mymessenger;

import java.util.Date;

public class Message {
    private BaseUser sender;
    private BaseUser recipient;
    private Date createDate;
    private Date update;
    private String text;

    public Message(BaseUser sender, BaseUser recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.createDate = new Date();
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return String.format("From: %s %s To: %s %s, Date: %s, Text: %s", 
                    sender.getFirstName(), sender.getLastName(), 
                    recipient.getFirstName(), recipient.getLastName(), 
                    createDate, text);
    }
}
