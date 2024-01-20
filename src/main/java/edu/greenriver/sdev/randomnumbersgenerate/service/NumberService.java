package edu.greenriver.sdev.randomnumbersgenerate.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Random;

@Service
public class NumberService {

    public int between(int low, int high){
        Random generator = new Random();
        return generator.nextInt(high-low);
    }

    public String genNumber (Model modelVars){
        modelVars.addAttribute("num", between(1,20));

        return "???";
    }
}
