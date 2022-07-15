package ar.com.h2.h2api.DTO;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
public class BookDTO {
    private Long id;
    @NotNull(message = "Title is required")
    private String title;
    @NotNull(message = "Pages is required")
    private Integer pages;
   @NotBlank(message = "Author is required")
    private String author;
   @NotNull(message = "Price is required")
    private Double price;
    @NotNull(message = "Release date  is required")
    private LocalDate releaseDate;
   @NotBlank(message = "Online is required")
    private Boolean online;
}
