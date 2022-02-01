package com.batilifting.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/** Represents a Document.
 * 
 * Voila est une partie de la couche persistance = couche data access 
 * @Entity : (classe Document ==> table in database Document) appele javax.persistence ===> JPA Java Persistence API pour gérer le mapping object/relationel 
 * @Getter , @Setter ===> utilise Lombok : c'est une dependance ajouté au fichier pom.xml : c'est une library qui remplace le code de Getter, Setter par des annotations faciles à utiliser
 * @Id : pour dire que private Long id est l'id de l'entité
 * @GeneratedValue : pour dire que id est auto généré
 * 
 * 
 * 
 * @author Akrem
 * @author Kamel
 * @version 1.0
*/



@Entity
@Setter
@Getter
public class Document {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	
	private float tva;

	
}
