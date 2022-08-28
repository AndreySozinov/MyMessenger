package mymessenger;

public class UserData {
    private static int id = 0;
    private BaseUser user;

    public UserData(BaseUser user) {
        id++;
        this.user = user;
    }

    public static Integer getId() {
        return id;
    }

    public BaseUser getUser() {
        return user;
    }

    @Override
    public String toString() {
        return String.format("id: %d Name: %s Surname: %s Year of birth: %d",
                        id, user.getFirstName(), user.getLastName(), 
                        user.getBirthYear());
    }
}
