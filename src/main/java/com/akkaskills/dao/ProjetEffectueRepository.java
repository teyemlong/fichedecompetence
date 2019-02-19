/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.ProjetEffectue;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface ProjetEffectueRepository extends MongoRepository<ProjetEffectue, String>{

}
