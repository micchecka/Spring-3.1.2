package Spring321.SpringApp.service;

import Spring321.SpringApp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    User getUserById(long id) ;

    List<User> getListOfUsers();
    void saveUser(User user);

    void deleteUser(Long id);
}
