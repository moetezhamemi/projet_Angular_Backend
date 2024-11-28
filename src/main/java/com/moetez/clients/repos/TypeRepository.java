package com.moetez.clients.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.moetez.clients.entities.type;
@RepositoryRestResource(path = "types")
@CrossOrigin("http://localhost:4200/")
public interface TypeRepository extends JpaRepository<type,Long> {
}
