package com.moetez.clients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moetez.clients.entities.client;
import com.moetez.clients.entities.type;
import com.moetez.clients.repos.clientRepository;
@Service
public class clientserviceimpl implements clientservice {
	@Autowired
	clientRepository cliRepository;
	
	@Override
	public client saveclient(client c) {
		return cliRepository.save(c);
	}
	@Override
	public client updateclient(client c) {
		
		return cliRepository.save(c);
	}
	@Override
	public void deleteclient(client c) {
		cliRepository.delete(c);
	}
	@Override
	public void deleteclientbyid(Long id) {
		cliRepository.deleteById(id);
	}
	@Override
	public client getclient(Long id) {
		
		return cliRepository.findById(id).get() ;
	}
	@Override
	public List<client> getallclients() {
	
		return cliRepository.findAll();
	}
	@Override
	public List<client> findByNomclient(String nom) {
		return cliRepository.findByNomclient(nom);
	}
	@Override
	public List<client> findByNomclientContains(String nom) {
		return cliRepository.findByNomclientContains(nom);
	}
	@Override
	public List<client> findByNomemail(String nom, String email) {
		return cliRepository.findByNomemail(nom, email);
	}
	@Override
	public List<client> findByType(type type) {
		return cliRepository.findByType(type);
	}
	@Override
	public List<client> findByType_Idtype(Long id) {
		return cliRepository.findByType_Idtype(id);
	}
	@Override
	public List<client> findByOrderByNomclientAsc() {
		return cliRepository.findByOrderByNomclientAsc();
	}
	@Override
	public List<client> trierclientnomemail() {
		return cliRepository.trierclientsnomsemail();
	}
	
}
