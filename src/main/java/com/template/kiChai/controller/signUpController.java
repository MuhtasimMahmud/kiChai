package com.template.kiChai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class signUpController {


    @GetMapping("/selectionPage")
    public String selectionPage(){
        return "selectionPage";
    }

    @GetMapping("/selectedOption")
    public String selectedOption(@RequestParam("Option") String option){

        System.out.println(option);

        if(option.equals("Customer")){
            return "customer/customerSignUp";
        } else if (option.equals("Specialist")) {
            return "specialist/specialistSignUp";
        }else{
            return "vendor/vendorSignUp";
        }
    }




}
