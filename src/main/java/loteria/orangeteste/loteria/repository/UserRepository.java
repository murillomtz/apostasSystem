package loteria.orangeteste.loteria.repository;

import loteria.orangeteste.loteria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, String> {


}
