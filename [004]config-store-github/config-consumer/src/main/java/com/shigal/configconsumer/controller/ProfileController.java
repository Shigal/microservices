package com.shigal.configconsumer.controller;

import com.shigal.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

//    @RequestMapping("/profile")
//    public MemberProfileConfiguration getDefaultModel(){
//        return memberProfileConfiguration;
//    }


    @RequestMapping("/profile")
    public String getDefaultModel(Model model){
        model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }
}
