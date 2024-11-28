package com.moetez.clients.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class client {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclient;
	private String nomclient; 
	private String emailclient;
	private Date dateinscription;
	private String adresseclient;
	@ManyToOne
	private type type;
	public long getIdclient() {
		return idclient;
	}
	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public String getEmailclient() {
		return emailclient;
	}
	public void setEmailclient(String emailclient) {
		this.emailclient = emailclient;
	}
	public Date getDateinscription() {
		return dateinscription;
	}
	public void setDateinscription(Date dateinscription) {
		this.dateinscription = dateinscription;
	}
	public String getAdresseclient() {
		return adresseclient;
	}
	public void setAdresseclient(String adresseclient) {
		this.adresseclient = adresseclient;
	}
	public client() {
		super();
	}
	public client(String nomclient, String emailclient, Date dateinscription, String adresseclient) {
		super();
		this.nomclient = nomclient;
		this.emailclient = emailclient;
		this.dateinscription = dateinscription;
		this.adresseclient = adresseclient;
	}
	@Override
	public String toString() {
		return "client [idclient=" + idclient + ", nomclient=" + nomclient + ", emailclient=" + emailclient
				+ ", dateinscription=" + dateinscription + ", adresseclient=" + adresseclient + "]";
	}
	public type getType() {
		return type;
	}
	public void setType(type type) {
		this.type = type;
	}
}
