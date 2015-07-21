package org.nails.controllers;


import org.nails.hibernate.entity.User;
import org.nails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public String loginForm() {
        return "login";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ModelAndView loginForm(@RequestParam(value = "error", required = false) String error,
                                  @RequestParam(required = false) String logout) {
        ModelAndView model = new ModelAndView("login");
        if (error != null) {
            model.addObject("error", error);
        }
        if (logout != null) {
            model.addObject("msg", logout);
        }
        return model;
    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Map<String, Object> model) {
        model.put("errorMessage", null);
        return "registration";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addUser(@Valid User user, BindingResult result, Map<String, Object> model) {
        String messageEmailError = userService.validateEmail(user);
        List<String> messages = new ArrayList<String>();
        if (messageEmailError != null || result.hasErrors()) {
            if (messageEmailError != null)
                messages.add(messageEmailError);
            if (result.hasErrors())
                for (ObjectError message : result.getAllErrors())
                    messages.add(message.getDefaultMessage());
            model.put("errorMessages", messages);
            return "registration";
        } else {
            userService.addUser(user);
            return "redirect:/auth";
        }
    }
}

