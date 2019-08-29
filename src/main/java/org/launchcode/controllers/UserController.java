package org.launchcode.controllers;


import org.launchcode.model.ApplicationUser;
import org.launchcode.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

}
