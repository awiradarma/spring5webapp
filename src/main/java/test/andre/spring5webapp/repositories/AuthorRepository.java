package test.andre.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.andre.spring5webapp.model.Author;

/**
 * Created by sj62262 on 1/17/18.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
