package org.launchcode.controllers;


import org.launchcode.model.ApplicationUser;
import org.launchcode.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ApplicationUser addUser(@RequestBody ApplicationUser applicationUser) {
        return userService.addUser(applicationUser);
    }

    @GetMapping("/user/id")
    public Map<String, Long> getUserIdForRequest(HttpServletRequest request)
    {
        return userService.getUserId(request);
    }


    @GetMapping("/public")
    public String publicmsg() {
        return "public mesaage";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Secured message";
    }


}
