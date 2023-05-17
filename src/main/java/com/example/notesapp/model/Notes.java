package com.example.notesapp.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class Notes {

    @Id
    private Integer id;

    private String email;

    private String title;

    private String description;

    private String Category;

    public Notes(Integer id, String email, String title, String description, String category) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.description = description;
        Category = category;
    }
}
