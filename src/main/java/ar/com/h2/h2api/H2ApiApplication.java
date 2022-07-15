package ar.com.h2.h2api;

import ar.com.h2.h2api.entities.Book;
import ar.com.h2.h2api.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class H2ApiApplication {

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(H2ApiApplication.class, args);
		context.getBean(BookRepository.class);
		BookRepository repository=context.getBean(BookRepository.class);
	}

}
