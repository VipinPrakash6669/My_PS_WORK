package MvcApp.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping("/home")
    public String showPage(){
        return "main-menu";
    }
}
