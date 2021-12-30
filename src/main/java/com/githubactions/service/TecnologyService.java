package com.githubactions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.githubactions.model.Tecnology;
import com.githubactions.repository.TecnologyRepository;

@Service
public class TecnologyService {
	
	@Autowired
	private TecnologyRepository repository;
	
	public Iterable<Tecnology> findAll() {
		return this.repository.findAll();
	}
	
	public Tecnology save(Tecnology tecnology) {
		return this.repository.save(tecnology);
	}

}
