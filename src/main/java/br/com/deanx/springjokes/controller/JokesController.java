package br.com.deanx.springjokes.controller;

import br.com.deanx.springjokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {
    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String makeJoke(Model model) {

        model.addAttribute("joke", jokesService.makeJoke());
        return "chucknorris";
    }
}
