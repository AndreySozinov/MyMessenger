package mymessenger;

public class User extends BaseUser implements UserAction{
    private int accessLevel;

    public User(String name, String lastName, int birthYear) {
        super(name, lastName, birthYear);
        this.accessLevel = 2;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    @Override
    public void sendMessage(BaseUser to, String text) {
        RepoMsg msg = new RepoMsg();
        msg.save(new Message(User.this, to, text));
    }

    @Override
    public void editMessage(Integer id, String newText) {
        RepoMsg msg = new RepoMsg();
        msg.editMsg(id, newText);
    }
}
