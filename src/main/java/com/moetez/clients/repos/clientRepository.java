package com.moetez.clients.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.moetez.clients.entities.client;
import com.moetez.clients.entities.type;
@RepositoryRestResource(path = "rest")
public interface clientRepository extends JpaRepository<client,Long> {
	List<client> findByNomclient(String nom);
	List<client> findByNomclientContains(String nom);
	/*@Query("select c from client where c.nomclient like %?1 and c.emailclient like %?2 ")
	List<client> findByNomemail(String nom,String email);*/
	@Query("select c from client c where c.nomclient like %:nom% and c.emailclient like %:email%")
	List<client> findByNomemail(@Param("nom") String nom, @Param("email") String email);
	@Query("select c from client c where c.type = ?1")
	List<client> findByType(type type);
	List<client> findByType_Idtype(Long id);
	List<client> findByOrderByNomclientAsc();
	@Query("select c from client c order by c.nomclient asc,c.emailclient desc")
	List<client> trierclientsnomsemail();
}
