package mymessenger;

import java.util.List;

public class Admin extends Moderator implements AdminAction{
    private int accessLevel;

    public Admin(String name, String lastName, int birthYear) {
        super(name, lastName, birthYear);
        this.accessLevel = 0;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    @Override
    public void showAllUsers() {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            System.out.println(user);
        }
    }

    @Override
    public void deleteUser(Integer id) {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            if (user.getId() == id) {
                userTable.remove(user);
            }
        }
        
    }
}
