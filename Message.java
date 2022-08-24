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

    
}
