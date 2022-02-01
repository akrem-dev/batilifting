package com.batilifting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batilifting.entities.Document;
import com.batilifting.repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements IDocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Document document) {
		documentRepository.save(document);
		
	}

	@Override
	public void delete(Document document) {
		// TODO Auto-generated method stub
		
	}

}
