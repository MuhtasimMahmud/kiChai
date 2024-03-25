package com.template.kiChai.controller.specialist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signUpController {


    @GetMapping("specialistSignUp/step1")
    public String step1(){
        return "specialist/signUp/signUpStep1";
    }

    @GetMapping("specialistSignUp/step2")
    public String step2(){
        return "specialist/signUp/signUpStep2";
    }

    @GetMapping("specialistSignUp/step3")
    public String step3(){
        return "specialist/signUp/signUpStep3";
    }


}
