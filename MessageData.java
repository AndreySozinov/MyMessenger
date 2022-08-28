package mymessenger;

import java.util.Date;

public class MessageData {
    private static int id;
    private Message message;

    public MessageData(Message message) {
        id++;
        this.message = message;
    }

    public static int getId() {
        return id;
    }

    public Message getMessage() {
        return message;
    }
    
    public void setText(String text) {
        message.setText(text);
        message.setUpdate(new Date());
    }

    @Override
    public String toString() {
        return String.format("id: %d %s", id, message);
    }
}
