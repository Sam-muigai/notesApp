package com.example.notesapp;

import com.example.notesapp.model.Notes;
import com.example.notesapp.repository.NotesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesAppApplication implements CommandLineRunner {

    private final NotesRepository repository;

    public NotesAppApplication(NotesRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(NotesAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Notes test = new Notes(null,"sam@gmail.com","Coding","Sam loves coding","CODING");
        repository.save(test);
    }
}
