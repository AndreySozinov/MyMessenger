package mymessenger;

import java.util.Date;

public class MessageData {
    private static Long id;
    Message message;

    public MessageData(Message message) {
        id++;
        this.message = message;
    }

    public static Long getId() {
        return id;
    }

    public Message getMessage() {
        return message;
    }
    
    public void setText(String text) {
        message.text = text;
        message.update = new Date();
    }

    @Override
    public String toString() {
        return String.format("id: %d %s", id, message);
    }
}
