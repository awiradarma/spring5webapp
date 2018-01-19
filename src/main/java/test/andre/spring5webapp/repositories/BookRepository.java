package test.andre.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.andre.spring5webapp.model.Book;

/**
 * Created by sj62262 on 1/17/18.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
