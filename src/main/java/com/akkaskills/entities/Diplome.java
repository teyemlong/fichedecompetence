/**
 * 
 */
package com.akkaskills.entities;

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
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Document
public class Diplome {
	@Id
	private String id;
	private String anneeOptentionDiplome; 
	private String nameDiplome;
	private String lieu;

}
