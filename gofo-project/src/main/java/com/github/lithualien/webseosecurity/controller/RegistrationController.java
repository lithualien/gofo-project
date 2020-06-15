package com.github.lithualien.webseosecurity.controller;

import com.github.lithualien.webseosecurity.entity.User;
import com.github.lithualien.webseosecurity.service.UserService;
import com.github.lithualien.webseosecurity.user.CrmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@Controller
//@RequestMapping("/register")
public class RegistrationController {

//    private UserService userService;
//
//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//    }
//
//    @GetMapping()
//    public String showMyLoginPage(Model theModel) {
//        theModel.addAttribute("crmUser", new CrmUser());
//        return "register";
//    }
//
//    @PostMapping()
//    public String processRegistrationForm(
//            @Valid @ModelAttribute("crmUser") CrmUser theCrmUser,
//            BindingResult theBindingResult,
//            Model theModel) {
//
//        String userName = theCrmUser.getUserName();
//        if (theBindingResult.hasErrors()){
//            return "register";
//        }
//        User existing = userService.findByUserName(userName);
//        if (existing != null){
//            theModel.addAttribute("crmUser", new CrmUser());
//            theModel.addAttribute("registrationError", "User name already exists.");
//            return "register";
//        }
//        userService.save(theCrmUser);
//        return "registration-confirmation";
//    }
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
}
