package ar.com.h2.h2api.service.Impl;

import ar.com.h2.h2api.DTO.BookDTO;
import ar.com.h2.h2api.entities.Book;
import ar.com.h2.h2api.exceptions.InvalidDTOException;
import ar.com.h2.h2api.mapper.BookMapper;
import ar.com.h2.h2api.repository.BookRepository;
import ar.com.h2.h2api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDTO saveNewBook(BookDTO dto) {
        validation(dto);
        Book entity=bookMapper.bookDto2Entity(dto);
        Book entitySaved=bookRepository.save(entity);
        BookDTO result=bookMapper.book2DTO(entitySaved);
        return result;


    }
    private void validation(BookDTO dto) {
        if (dto == null)
            throw new InvalidDTOException("Book cannot be null");
        if (dto.getTitle() == null || dto.getTitle().isEmpty())
            throw new InvalidDTOException("Title cannot be empty or null");
        if (dto.getPages() == null )
            throw new InvalidDTOException("Page cannot be empty or null");
        if (dto.getAuthor() == null || dto.getAuthor().isEmpty())
            throw new InvalidDTOException("Author cannot be empty or null");
        if (dto.getPrice() == 0)
            throw new InvalidDTOException("Price cannot be null");
        if (dto.getReleaseDate() == null)
            throw new InvalidDTOException("Release Date cannot be null");
        if (dto.getOnline() == null)
            throw new InvalidDTOException("Online cannot be null");
    }
}
