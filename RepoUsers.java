package mymessenger;

import java.util.List;

public class RepoUsers implements Repository<BaseUser, Integer>{
    @Override
    public Integer save(BaseUser user) {
        List<UserData> userTable = DataBase.getUserTable();
        userTable.add(new UserData(user));
        return UserData.getId();
    } 

    @Override
    public BaseUser findById(Integer id) {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            if (user.getId() == id) {
                return user.getUser();
            }
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            if (user.getId() == id) {
                userTable.remove(user);
            }
        }
        
    }
}
