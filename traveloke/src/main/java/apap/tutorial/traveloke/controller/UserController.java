package apap.tutorial.traveloke.controller;

import apap.tutorial.traveloke.model.UserModel;
import apap.tutorial.traveloke.service.RoleService;
import apap.tutorial.traveloke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUserSubmit(
            @ModelAttribute UserModel user, Model model){
        String notif = null;
        try {
            userService.addUser(user);
            notif = "User berhasil dibuat";
        } catch (Exception e){
            notif = "Gagal, username tersebut telah terdaftar";
        }
        boolean hasNotif = (notif != null);
        model.addAttribute("user", user);
        model.addAttribute("notif", notif);
        model.addAttribute("hasNotif", hasNotif);
        model.addAttribute("listRole", roleService.findAll());
        return "home";
    }

    @RequestMapping(value = "/changePass", method = RequestMethod.POST)
    public String changePasswordSubmit(@ModelAttribute UserModel user,String oldPassword, String newPassword,
                                       String confirmPassword, Model model) {
        String alert = userService.updatePassword(user, oldPassword, newPassword, confirmPassword);
        model.addAttribute("alert", alert);
        return "redirect:/";
    }

}
