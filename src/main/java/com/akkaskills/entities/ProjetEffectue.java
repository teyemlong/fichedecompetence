/**
 * 
 */
package com.akkaskills.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Robert
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class ProjetEffectue {
	@Id
	private String id;
	private String nomClient;
	private String lieuduProjet;
	private Date dateDebut; 
	private Date dateFin;
	private String posteOccuper;
	private String intituleProjet;
	private String realisation;
	private String resultat;
	private String environnementTechnique;

}
