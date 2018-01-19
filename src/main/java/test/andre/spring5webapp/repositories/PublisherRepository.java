package test.andre.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.andre.spring5webapp.model.Publisher;

/**
 * Created by sj62262 on 1/18/18.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
