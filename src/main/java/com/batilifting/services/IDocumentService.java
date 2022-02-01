package com.batilifting.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.batilifting.entities.Document;


public interface IDocumentService {
	
	public List<Document> findAll();

	public Document findOne(Long id);

	public void save(Document document);

	public void delete(Document document);

}
