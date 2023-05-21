package com.example.notesapp;

import com.example.notesapp.model.Notes;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface NotesRepository extends ListCrudRepository<Notes,Integer> {
    List<Notes> findAllByEmail(String email);

    List<Notes> findAllByEmailAndTitleContainingIgnoreCase(String email,String searchTerm);
}
