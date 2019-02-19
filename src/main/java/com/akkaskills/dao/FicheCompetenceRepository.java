/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.FicheCompetence;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface FicheCompetenceRepository extends MongoRepository<FicheCompetence, String> {

}
