/**
 * 
 */
package com.akkaskills.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.akkaskills.dao.FicheCompetenceRepository;
import com.akkaskills.entities.FicheCompetence;


/**
 * @author Robert
 *
 */
@RestController
public class FicheCompetenceController {
	@Autowired
	private FicheCompetenceRepository ficheCompetenceRepository;
	
	@RequestMapping(value="/ficheCompetences",method=RequestMethod.GET)
	public List<FicheCompetence> getFicheCompetence(){
		return ficheCompetenceRepository.findAll();
	}
	
	@RequestMapping(value="/ficheCompetences/{id}",method=RequestMethod.GET)
	public Optional<FicheCompetence> getFormationAcquisTechniques(@PathVariable String id){
		return ficheCompetenceRepository.findById(id);
		}
	@RequestMapping(value="/ficheCompetences",method=RequestMethod.POST)
	public FicheCompetence saveFormationAcquisTechniques(@RequestBody FicheCompetence ficheCompetence){
		return ficheCompetenceRepository.save(ficheCompetence);
	}
	
	@RequestMapping(value="/ficheCompetences/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable String id){
		ficheCompetenceRepository.deleteById(id);
		return true;
		}
	
	@RequestMapping(value="/ficheCompetences/{id}",method=RequestMethod.PUT)
	public FicheCompetence update(@PathVariable String id, @RequestBody FicheCompetence ficheCompetence){
		ficheCompetence.setId(id);
		return ficheCompetenceRepository.save(ficheCompetence);
		}

} 
