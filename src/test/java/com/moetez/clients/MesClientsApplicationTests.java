package com.moetez.clients;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moetez.clients.entities.client;
import com.moetez.clients.entities.type;
import com.moetez.clients.repos.clientRepository;

@SpringBootTest
class MesClientsApplicationTests {
@Autowired
private clientRepository  cliRepository;
@Test
public void testcreateclient() {
	client cli = new client("moetez","tezzhamemi@gmail.com",new Date(),"nabeul");
	cliRepository.save(cli);
}
@Test
public void testFindClient()
{
	client c = cliRepository .findById(6L).get();
	System.out.println(c);
}
@Test
public void testUpdateClient()
{
	client c = cliRepository.findById(6L).get();
	c.setNomclient("tezz");
	cliRepository.save(c);
}
@Test
public void testDeleteClient()
{
	cliRepository.deleteById(1L);
}
@Test
public void testListerTousclients()
{
List<client> cls = cliRepository.findAll();
for (client  p : cls)
	{
	  System.out.println(p);
	}
}
@Test
public void testFindByNomclient()
{
	List<client> cls = cliRepository.findByNomclient("moetez");
	for (client c : cls)
	{
	System.out.println(c);
	}

}

@Test
public void testFindByNomclientContains()
{
	List<client> cls = cliRepository.findByNomclientContains("z");
	for (client c : cls)
	{
	System.out.println(c);
	}

	}
@Test 
public void testfindByNomemail()
{
	List<client> cls = cliRepository.findByNomemail("alaa","moetz@gmail.com");
	for (client c : cls)
	{
	System.out.println(c);
	}
}
@Test
public void testFindByType() {
    type type = new type();
    type.setIdtype(1l);
    List<client> cls = cliRepository.findByType(type);
    for (client c : cls) {
        System.out.println(c);
    }
}
@Test
public void findByTypeIdType() {
    Long id = 1L;
    List<client> cls = cliRepository.findByType_Idtype(id);
    for (client c : cls) {
        System.out.println(c);
    }
}
@Test
public void testfindByOrderByNomclientAsc()
{
	List<client> cls = cliRepository.findByOrderByNomclientAsc();
	for (client c :cls)
	{
		System.out.println(c);
	}
}
@Test
public void testtrierclientsnomemail()
{
	List<client> cls = cliRepository.trierclientsnomsemail();
	for(client c : cls)
	{
		System.out.println(c);
	}
	
}
}
