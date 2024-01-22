package edu.greenriver.sdev.randomnumbersgenerate.controller;

import edu.greenriver.sdev.randomnumbersgenerate.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NumberController {

    private NumberService service;

    public NumberController(NumberService service){
        this.service = service;
    }

//    @RequestMapping("/random")
//    public String genNumber(Model modelVars){
//        modelVars.addAttribute("num", service.between(1,20));
//        return "genNumber";
//    }

//    @RequestMapping("/random")
//    public String genNumber(Model modelVars){
//
//        List<Integer> powerballNums = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++){
//            powerballNums.add(service.between(1,69));
//        }
//
//        powerballNums.add(service.between(1,29));
//        modelVars.addAttribute("powerballNums", powerballNums);
//
//        return "genNumber";
//    }

    @RequestMapping("/random")
    public String genNumber(Model modelVars){

        List<Integer> LargGroupNums = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            LargGroupNums.add(service.between(1,20));
        }

        modelVars.addAttribute("LargGroupNums", LargGroupNums);

        return "genNumber";
    }




}
