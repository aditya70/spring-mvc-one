package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.tutorial.spring.service.ExplanationServiceImpl;

@Controller
public class ExplanationController {

    @Autowired
    private ExplanationServiceImpl explanationService;

    @RequestMapping(value = "/whymood")
    public String home(ModelMap map, @RequestParam("feeling") String feeling) {
        map.addAttribute("feeling", feeling);
        map.addAttribute("moodExplanation", explanationService.getMoodExplanation(feeling));
        return "explanation";
    }
}
