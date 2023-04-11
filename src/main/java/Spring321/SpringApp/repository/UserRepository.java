package Spring321.SpringApp.repository;

import Spring321.SpringApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {  }
