package edu.greenriver.sdev.randomnumbersgenerate.controller;

import edu.greenriver.sdev.randomnumbersgenerate.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {

    private NumberService service;

    public NumberController(NumberService service){
        this.service = service;
    }

    @RequestMapping("/random")
    public String genNumber(){
        return String.valueOf(service);
    }
}
