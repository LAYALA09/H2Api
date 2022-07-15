package ar.com.h2.h2api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private Integer pages;

    private String author;
    @NotNull(message = "Price is required")
    private Double price;
    @NotNull(message = "Release date  is required")
    private LocalDate releaseDate;
    @NotBlank(message = "Online is required")
    private Boolean online;


}
