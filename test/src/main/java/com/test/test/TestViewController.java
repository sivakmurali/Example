package com.test.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestViewController {
	
	@Autowired
	private TestController test;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		List<BeWrkrProfile> wrkrLst=test.getAll();
		
		model.addAttribute("name", name);
		model.addAttribute("size", wrkrLst.size());
        return "greeting";
    }

}
