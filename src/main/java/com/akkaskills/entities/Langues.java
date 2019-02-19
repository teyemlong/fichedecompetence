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
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Langues {
	@Id
	private String id;
	private String label;
	private String niveau;

}
