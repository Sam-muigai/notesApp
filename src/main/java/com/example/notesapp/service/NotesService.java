package com.example.notesapp.service;

import com.example.notesapp.model.Notes;
import com.example.notesapp.repository.NotesRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class NotesService {

    private final NotesRepository repository;


    public NotesService(NotesRepository repository) {
        this.repository = repository;
    }


    public List<Notes> getAllNotes(){
     return repository.findAll();
    }


    public void addNote(Notes note){
        repository.save(note);
    }

    public Notes getNoteById(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NO_CONTENT)
        );
    }

    public void updateById(Integer id, @NotNull Notes note){
        Notes noteToUpdate = getNoteById(id);
        noteToUpdate.setCategory(note.getCategory());
        noteToUpdate.setEmail(note.getEmail());
        noteToUpdate.setTitle(note.getTitle());
        noteToUpdate.setDescription(note.getDescription());
        repository.save(noteToUpdate);
    }

    public List<Notes> getAllNotesByEmail(String email){
        return repository.findAllByEmail(email);
    }

    public void deleteNote(Integer id){
        repository.deleteById(id);
    }

}
