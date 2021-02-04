package loteria.orangeteste.loteria.service.serviceImp;

import loteria.orangeteste.loteria.model.User;
import loteria.orangeteste.loteria.service.IApostaService;
import loteria.orangeteste.loteria.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Boolean existsByEmail(String email) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
