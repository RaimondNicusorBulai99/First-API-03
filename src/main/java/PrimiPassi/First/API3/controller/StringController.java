package PrimiPassi.First.API3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String concat2Str(@RequestParam String strOne, @RequestParam(required = false) String strTwo) {
        if (strTwo == null) {
            return strOne;
        } else {
            return strOne.concat(strTwo);
        }
    }
}
