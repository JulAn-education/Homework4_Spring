package ru.gb.Homework4_Spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.Homework4_Spring.models.Person;
import ru.gb.Homework4_Spring.services.PersonService;

import java.util.List;

@Controller
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;


    @GetMapping("/persons")
    public String viewPersons(Model model){
        List<Person> persons = personService.getAll();
        model.addAttribute("persons", persons);
        return "persons";

    }

    @PostMapping("/persons")
    public String addPerson(Person p, Model model){
        personService.addPerson(p);
        List<Person> persons = personService.getAll();
        model.addAttribute("persons", persons);
        return "persons";
    }

}
