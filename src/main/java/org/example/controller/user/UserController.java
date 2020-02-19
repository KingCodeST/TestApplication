package org.example.controller.user;

import org.example.domain.user.User;
import org.example.factory.user.UserFactory;
import org.example.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    User user;
    UserFactory userFactory;



    @PostMapping("/create")
    @ResponseBody
    public User create( User user)
    {

        User user1 = UserFactory.GenericBuilder(user.getStudentNo(),user.getFname(),user.getLname(),user.getAddressId(),user.getContactId(),user.getLocationId());

        System.out.println("we are here");
        return service.create(user1);
    }

    @PostMapping("/update")
    @ResponseBody
    public User update(User user)
    {
        return service.update(user);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public User read(@PathVariable String id)
    {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<User> getAll()
    {
        return service.getAll();
    }


}
