package mymessenger;

import java.util.List;

public class RepoMsg implements Repository<Message, Integer>{
    @Override
    public Integer save(Message msg) {
        List<MessageData> messageTable = DataBase.getMessageTable();
        messageTable.add(new MessageData(msg));
        return MessageData.getId();
    }

    @Override
    public Message findById(Integer id) {
        List<MessageData> messageTable = DataBase.getMessageTable();
        for (MessageData msg : messageTable) {
            if (msg.getId() == id) {
                return msg.getMessage();
            }
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        List<MessageData> messageTable = DataBase.getMessageTable();
        for (MessageData msg : messageTable) {
            if (msg.getId() == id) {
                messageTable.remove(msg);
            }
        }
    }

    public void editMsg(Integer id, String text) {
        List<MessageData> messageTable = DataBase.getMessageTable();
        for (MessageData msg : messageTable) {
            if (msg.getId() == id) {
                msg.setText(text);
            }
        }
    }
}
