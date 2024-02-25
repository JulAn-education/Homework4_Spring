package ru.gb.Homework4_Spring.services;

import org.springframework.stereotype.Service;
import ru.gb.Homework4_Spring.models.Person;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person p) {
        persons.add(p);
    }

    public List<Person> getAll() {
        return persons;
    }

}
