package ir.sm.weblog.modules.users.service;


import ir.sm.weblog.modules.users.model.Users;
import ir.sm.weblog.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Transactional
    public Users registerUser(Users users) {
        return this.usersRepository.save(users);
    }

    public List<Users> findAllUsers() {
        return this.usersRepository.findAll();
    }


}
