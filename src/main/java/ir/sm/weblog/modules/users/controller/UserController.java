package ir.sm.weblog.modules.users.controller;


import ir.sm.weblog.modules.users.model.Users;
import ir.sm.weblog.modules.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @RequestMapping(value={"/",""}, method= RequestMethod.GET)
    public List<Users> getUsers(){
        return this.userService.findAllUsers();
    }

    @RequestMapping(value={"/",""},method = RequestMethod.POST)
    public Users registerUser(@RequestBody Users user){
        return this.userService.registerUsers(user);
    }
}
