package mymessenger;

public interface ModeratorAction extends UserAction{
    void deleteMsg(Integer id);
    void showAllMessages();
}
