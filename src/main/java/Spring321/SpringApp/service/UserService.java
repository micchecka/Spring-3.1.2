package Spring321.SpringApp.service;



import Spring321.SpringApp.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User getUserById(long id) ;

    List<User> getListOfUsers();
    User editUser(User user);

    void deleteUser(Long id);
}
