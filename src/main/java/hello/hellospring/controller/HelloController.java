package hello.hellospring.controller;
import hello.hellospring.dto.TestDTO;
import hello.hellospring.service.TestService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    private static TestService testService;

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name",required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name ){
        return "hello" + name;
    }

@GetMapping("hello-api")
@ResponseBody
public Hello helloApi(@RequestParam("name") String name){
    Hello hello = new Hello();
    hello.setName(name);
    return hello;
}
@Getter
@Setter
    static class Hello{
        private String name;
    }


    @GetMapping("test")
    @ResponseBody
    public List<TestDTO> getTestData() {
//     System.out.println(testService.getTestData());
        return testService.getTestData();
    }

}
