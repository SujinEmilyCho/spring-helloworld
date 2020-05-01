package wooteco.helloworld.controller;

import org.springframework.web.bind.annotation.*;
import wooteco.helloworld.domain.User;

@RestController
public class UserController {
    /**
     * GET /users
     */
    @GetMapping("/users")
    public String sayHi(@RequestParam String name) {
        return "Hi " + name;
    }

    /**
     * GET /users/{id}
     */
    @RequestMapping("/users/{id}")
    public String retrieveUser(@PathVariable Long id) {
        return "user's id is " + id;
    }

    /**
     * POST /users
     */
    @PostMapping("/users")
    public String createUserWithJson(@RequestBody User user) {
        return "Hello " + user.getName();
    }

    /**
     * POST /users/form
     */
    @PostMapping("/users/form")
    public String createUserWithForm(User user) {
        return "Hello " + user.getName();
    }
}
