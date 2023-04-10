package Spring321.SpringApp.service;

import Spring321.SpringApp.repository.UserRepository;
import Spring321.SpringApp.model.User;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    public User getUserById(long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getListOfUsers() {
        return userRepository.findAll();
    }


    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
