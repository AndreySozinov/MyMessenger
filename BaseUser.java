package mymessenger;

public abstract class BaseUser {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int count;

    public BaseUser(String name, String lastName, int birthYear) {
        this.firstName = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public BaseUser() {
        this("guest" + count++, "", 0);
    }
}
