package mymessenger;

public class Admin extends Moderator implements AdminAction{
    public Admin(String name, String lastName, int birthYear) {
        super(name, lastName, birthYear);
    }

    @Override
    public void showAllUsers() {
        // TODO Auto-generated method stub
        
    }

    // public void showAllMessages() {
    //     List<MessageData> messageTable = DataBase.getMessageTable();
    //     for (MessageData msg : messageTable) {
    //         System.out.println(msg);
    //     }
    // }

    @Override
    public void deleteUser() {
        // TODO Auto-generated method stub
        
    }
}
