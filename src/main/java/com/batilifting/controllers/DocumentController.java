package com.batilifting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.batilifting.entities.Document;
import com.batilifting.services.IDocumentService;

@RestController
public class DocumentController {

	@Autowired
	private IDocumentService  documentService;
	
	@RequestMapping(value = "/document/create" , method = RequestMethod.POST)
	public void createDocument(@RequestBody Document document) {
		documentService.save(document);
	}
}	
