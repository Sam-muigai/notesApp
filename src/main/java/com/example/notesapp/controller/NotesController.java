package com.example.notesapp.controller;

import com.example.notesapp.model.Notes;
import com.example.notesapp.service.NotesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class NotesController {

    private final NotesService service;

    public NotesController(NotesService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/notes")
    public List<Notes> getAllNotes(){
        return service.getAllNotes();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/notes/{email}")
    public List<Notes> getNotesById(@PathVariable String email){
        return service.getAllNotesByEmail(email);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/notes/{id}")
    public Notes getNoteById(@PathVariable Integer id){
        return service.getNoteById(id);
    }

    @PostMapping("/notes")
    public void saveNote(@RequestBody Notes note){
        service.addNote(note);
    }

    @PutMapping("/notes/{id}")
    public void updateNote(@PathVariable Integer id,@RequestBody Notes note){
        service.updateById(id, note);
    }

    @DeleteMapping("/notes/{id}")
    public void deleteNoteById(@PathVariable Integer id){
        service.deleteNote(id);
    }

}
