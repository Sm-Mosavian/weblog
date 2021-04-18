package ir.sm.weblog.modules.users.service;


import ir.sm.weblog.modules.users.model.Users;
import ir.sm.weblog.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UsersRepository usersRepository;

    @Autowired
    public UserService( UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    public Users registerUsers(Users users){
        return this.usersRepository.save(users);
    }

    public List<Users> findAllUsers()
    {return this.usersRepository.findAll();}

}
