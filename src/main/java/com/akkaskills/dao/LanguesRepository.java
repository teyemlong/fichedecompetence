/**
 * 
 */
package com.akkaskills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akkaskills.entities.Langues;

/**
 * @author Robert
 *
 */
@RepositoryRestResource
public interface LanguesRepository extends MongoRepository<Langues, String> {

}
