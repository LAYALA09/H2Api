package ar.com.h2.h2api.mapper;

import ar.com.h2.h2api.DTO.BookDTO;
import ar.com.h2.h2api.entities.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
  //  Dto to Entity
    public Book bookDto2Entity(BookDTO dto){
        Book entity = new Book();
        entity.setTitle(dto.getTitle());
        entity.setPages(dto.getPages());
        entity.setAuthor(dto.getAuthor());
        entity.setPrice(dto.getPrice());
        entity.setReleaseDate(dto.getReleaseDate());
        entity.setOnline(dto.getOnline());
        return entity;



    }
    //Entity to DTo
    public BookDTO book2DTO(Book entity){
        BookDTO dto=new BookDTO();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setPages(entity.getPages());
        dto.setAuthor(entity.getAuthor());
        dto.setPrice(entity.getPrice());
        dto.setReleaseDate(entity.getReleaseDate());
        dto.setOnline(entity.getOnline());
        return dto;

    }

}
