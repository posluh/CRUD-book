package ru.posluhpc.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.posluhpc.crud.model.User;
import ru.posluhpc.crud.service.UserService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public String getAllUser(Model model){
        model.addAttribute("users", userService.getAllUser());
        model.addAttribute("user", new User());
        return "user";
    }
    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/api/user/all";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id){
        userService.delete(id);
        return "redirect:/api/user/all";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam Long id, Model model){
        Optional<User> user = userService.getById(id);
        model.addAttribute("user", user);
        return "editUser";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/api/user/all";
    }
}
