/**
 * 
 */
package com.akkaskills.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.akkaskills.dao.FormationComplementaireRepository;
import com.akkaskills.entities.FormationComplementaire;
/**
 * @author Robert
 *
 */
@RestController
public class FormationComplementaireController {
	@Autowired
	private FormationComplementaireRepository formationComplementaireRepository;
	
	@RequestMapping(value="/formationComplementaires",method=RequestMethod.GET)
	public List<FormationComplementaire> getProjetEffectue(){
		return formationComplementaireRepository.findAll();
	}

}
