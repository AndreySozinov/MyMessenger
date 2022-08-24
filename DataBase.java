package mymessenger;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final List<UserData> userTable = new ArrayList<>();
    private static final List<MessageData> messageTable = new ArrayList<>();

    private DataBase() {
        
    }

    public static List<UserData> getUserTable() {
        return userTable;
    }

    public static List<MessageData> getMessageTable() {
        return messageTable;
    }
}
