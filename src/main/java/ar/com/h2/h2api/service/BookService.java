package ar.com.h2.h2api.service;

import ar.com.h2.h2api.DTO.BookDTO;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    BookDTO saveNewBook(BookDTO newBook);


}
