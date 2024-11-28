package com.moetez.clients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.moetez.clients.entities.client;
import com.moetez.clients.service.clientservice;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class clientRestController {
	@Autowired
	clientservice cliservice;
	@RequestMapping(method=RequestMethod.GET)
	public List<client> getAllclients()
	{
		return cliservice.getallclients();	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public client getclientByid(@PathVariable("id") Long id) {
		return cliservice.getclient(id);
	}
	@RequestMapping(method=RequestMethod.POST)
	public client createClient(@RequestBody client cli)
	{
		return cliservice.saveclient(cli);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public client updateClient(@RequestBody client cli)
	{
		return cliservice.updateclient(cli);

	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteClient(@PathVariable("id") Long id)
	{
		cliservice.deleteclientbyid(id);
	}
	@RequestMapping(value="/clstype/{idtype}",method=RequestMethod.GET)
	public List<client> getClientByTypeId(@PathVariable("idtype") Long id)
	{
		return cliservice.findByType_Idtype(id);
	}
	}
	
