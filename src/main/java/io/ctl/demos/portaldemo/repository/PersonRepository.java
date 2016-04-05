package io.ctl.demos.portaldemo.repository;

import io.ctl.demos.portaldemo.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
