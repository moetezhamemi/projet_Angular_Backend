package com.moetez.clients.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomclient",types = {client.class})
public interface clientProjection {
	public String getNomclient();

}
