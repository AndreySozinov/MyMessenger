package mymessenger;

import java.util.List;

public class Moderator extends User implements ModeratorAction{
    private int accessLevel;

    public Moderator(String name, String lastName, int birthYear) {
        super(name, lastName, birthYear);
        this.accessLevel = 1;
    }

    @Override
    public void deleteMsg(Integer id) {
        RepoMsg msg = new RepoMsg();
        msg.deleteById(id);
    }

    @Override
    public void showAllMessages() {
        List<MessageData> messageTable = DataBase.getMessageTable();
        for (MessageData msg : messageTable) {
            System.out.println(msg);
        }
    }
}
