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

import com.akkaskills.dao.ProjetEffectueRepository;
import com.akkaskills.entities.ProjetEffectue;

/**
 * @author Robert
 *
 */
@RestController
public class ProjetEffectueController {
	@Autowired
	private ProjetEffectueRepository projetEffectueRepository;
	
	@RequestMapping(value="/projetEffectues",method=RequestMethod.GET)
	public List<ProjetEffectue> getProjetEffectue(){
		return projetEffectueRepository.findAll();
	}
	
	@RequestMapping(value="/projetEffectues/{id}",method=RequestMethod.GET)
	public Optional<ProjetEffectue> getProjetEffectue(@PathVariable String id){
		return projetEffectueRepository.findById(id);
		}

	@RequestMapping(value="/projetEffectues",method=RequestMethod.POST)
	public ProjetEffectue saveProjetEffectue(@RequestBody ProjetEffectue projetEffectue){
		return projetEffectueRepository.save(projetEffectue);
	}
	
	@RequestMapping(value="/projetEffectues/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable String id){
		projetEffectueRepository.deleteById(id);
		return true;
		}
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT)
	public ProjetEffectue update(@PathVariable String id, @RequestBody ProjetEffectue projetEffectue){
		projetEffectue.setId(id);
		return projetEffectueRepository.save(projetEffectue);
		}
}
