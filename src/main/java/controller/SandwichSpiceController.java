package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class SandwichSpiceController {
    @GetMapping("/spices")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(ModelMap model, @RequestParam("condiment") String[] condiment) {
        model.addAttribute("selectedcondiments",condiment);
        return "selectedcondiments";
    }

}
