package com.moetez.clients.service;

import java.util.List;

import com.moetez.clients.entities.client;
import com.moetez.clients.entities.type;

public interface clientservice {
	client saveclient(client c);
	client updateclient(client c);
	void deleteclient(client c);
	void deleteclientbyid(Long id);
	client getclient(Long id);
	List<client> getallclients();
	List<client> findByNomclient(String nom);
	List<client> findByNomclientContains(String nom);
	List<client> findByNomemail (String nom, String email);
	List<client> findByType(type type);
	List<client> findByType_Idtype(Long id);
	List<client> findByOrderByNomclientAsc();
	List<client> trierclientnomemail();

	

}
