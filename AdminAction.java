package mymessenger;

public interface AdminAction extends ModeratorAction{
    public void showAllUsers();
    public void deleteUser(Long id);
}
