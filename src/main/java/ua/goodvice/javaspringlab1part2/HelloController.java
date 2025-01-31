package ua.goodvice.javaspringlab1part2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    String helloWorld() {
        return "Hello, World!";
    }
}
