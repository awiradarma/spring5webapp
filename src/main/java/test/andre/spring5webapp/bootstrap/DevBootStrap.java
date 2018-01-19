package test.andre.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import test.andre.spring5webapp.model.Author;
import test.andre.spring5webapp.model.Book;
import test.andre.spring5webapp.model.Publisher;
import test.andre.spring5webapp.repositories.AuthorRepository;
import test.andre.spring5webapp.repositories.BookRepository;
import test.andre.spring5webapp.repositories.PublisherRepository;

/**
 * Created by sj62262 on 1/18/18.
 */
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    public void init() {
        Publisher harper = new Publisher("Harper Collins","London");
        Book ddd = new Book("Domain Driven Design", "1234");
        ddd.setPublisher(harper);
        Author eric = new Author("Eric","Evans");
        ddd.getAuthors().add(eric);
        eric.getBooks().add(ddd);

        Publisher wrox = new Publisher("Wrox","New York");
        Book spring = new Book("Spring in Action", wrox, "4567");
        Author john = new Author("John", "Smith");
        spring.getAuthors().add(john);
        john.getBooks().add(spring);

        publisherRepository.save(wrox);
        authorRepository.save(john);
        bookRepository.save(spring);


        publisherRepository.save(harper);
        authorRepository.save(eric);
        bookRepository.save(ddd);
    }
}
