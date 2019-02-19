/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.Diplome;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface DiplomeRepository extends MongoRepository<Diplome, String>{

}
