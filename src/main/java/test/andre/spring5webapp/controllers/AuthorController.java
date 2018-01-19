package test.andre.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test.andre.spring5webapp.repositories.AuthorRepository;

/**
 * Created by sj62262 on 1/19/18.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("listofauthors", authorRepository.findAll());

        return "authors"; // name of view, a.k.a the thymeleaf template

    }
}
