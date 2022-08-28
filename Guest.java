package mymessenger;

public class Guest extends BaseUser implements BaseUserAction<BaseUser, String>{
    private int accessLevel;
    
    public Guest() {
        super();
        this.accessLevel = 5;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    @Override
    public void sendMessage(BaseUser to, String text) {
        RepoMsg msg = new RepoMsg();
        msg.save(new Message(Guest.this, to, text));
    }
}
