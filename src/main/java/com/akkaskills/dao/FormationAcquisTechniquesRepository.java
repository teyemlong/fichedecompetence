/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.FormationAcquisTechniques;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface FormationAcquisTechniquesRepository extends MongoRepository<FormationAcquisTechniques, String>{

}
