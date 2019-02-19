/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.FormationComplementaire;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface FormationComplementaireRepository extends MongoRepository<FormationComplementaire, String>{

}
