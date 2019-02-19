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
import com.akkaskills.dao.FormationAcquisTechniquesRepository;
import com.akkaskills.entities.FormationAcquisTechniques;
import com.akkaskills.entities.ProjetEffectue;


/**
 * @author Robert
 *
 */
@RestController
public class FormationAcquisTechniquesController {
	@Autowired
	private FormationAcquisTechniquesRepository formationAcquisTechniquesRepository;
	
	@RequestMapping(value="/formationAcquisTechniques",method=RequestMethod.GET)
	public List<FormationAcquisTechniques> getFormationAcquisTechniques(){
		return formationAcquisTechniquesRepository.findAll();
	}
	
	@RequestMapping(value="/formationAcquisTechniques/{id}",method=RequestMethod.GET)
	public Optional<FormationAcquisTechniques> getFormationAcquisTechniques(@PathVariable String id){
		return formationAcquisTechniquesRepository.findById(id);
		}
	@RequestMapping(value="/formationAcquisTechniques",method=RequestMethod.POST)
	public FormationAcquisTechniques saveFormationAcquisTechniques(@RequestBody FormationAcquisTechniques formationAcquisTechniques){
		return formationAcquisTechniquesRepository.save(formationAcquisTechniques);
	}
	
	@RequestMapping(value="/formationAcquisTechniques/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable String id){
		formationAcquisTechniquesRepository.deleteById(id);
		return true;
		}
	
	@RequestMapping(value="/formationAcquisTechniques/{id}",method=RequestMethod.PUT)
	public FormationAcquisTechniques update(@PathVariable String id, @RequestBody FormationAcquisTechniques formationAcquisTechniques){
		formationAcquisTechniques.setId(id);
		return formationAcquisTechniquesRepository.save(formationAcquisTechniques);
		}

}
