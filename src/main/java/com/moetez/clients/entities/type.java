package com.moetez.clients.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtype;
	private String nomtype;
	@JsonIgnore
	@OneToMany (mappedBy = "type")
	private List<client> clients;
	public type() {}
	public type(Long idtype, String nomtype, List<client> clients) {
		super();
		this.idtype = idtype;
		this.nomtype = nomtype;
		this.clients = clients;
	}
	public Long getIdtype() {
		return idtype;
	}
	public void setIdtype(Long idtype) {
		this.idtype = idtype;
	}
	public String getNomtype() {
		return nomtype;
	}
	public void setNomtype(String nomtype) {
		this.nomtype = nomtype;
	}
	public List<client> getClients() {
		return clients;
	}
	public void setClients(List<client> clients) {
		this.clients = clients;
	}
}
