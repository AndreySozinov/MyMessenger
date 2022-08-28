package mymessenger;

public interface AdminAction extends ModeratorAction{
    void showAllUsers();
    void deleteUser(Integer id);
}
