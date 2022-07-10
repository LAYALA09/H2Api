package ar.com.h2.h2api.service.Impl;

import ar.com.h2.h2api.DTO.BookDTO;
import ar.com.h2.h2api.entities.Book;
import ar.com.h2.h2api.mapper.BookMapper;
import ar.com.h2.h2api.repository.BookRepository;
import ar.com.h2.h2api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDTO saveNewBook(BookDTO dto) {
        Book entity=bookMapper.bookDto2Entity(dto);
        Book entitySaved=bookRepository.save(entity);
        BookDTO result=bookMapper.Book2DTO(entitySaved);
        return result;


    }
}
