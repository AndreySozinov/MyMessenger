package mymessenger;

import java.util.Date;

public class Message {
    BaseUser sender;
    BaseUser recipient;
    Date createDate;
    Date update;
    String text;

    public Message(BaseUser sender, BaseUser recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.createDate = new Date();
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("From: %s %s To: %s %s, Date: %s, Text: %s", 
                    sender.getFirstName(), sender.getLastName(), 
                    recipient.getFirstName(), recipient.getLastName(), 
                    createDate, text);
    }
}
