package com.akkaskills;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.akkaskills.dao.DiplomeRepository;
import com.akkaskills.dao.FicheCompetenceRepository;
import com.akkaskills.dao.FormationAcquisTechniquesRepository;
import com.akkaskills.dao.FormationComplementaireRepository;
import com.akkaskills.dao.LanguesRepository;
import com.akkaskills.dao.ProjetEffectueRepository;
import com.akkaskills.entities.Diplome;
import com.akkaskills.entities.FicheCompetence;
import com.akkaskills.entities.FormationAcquisTechniques;
import com.akkaskills.entities.FormationComplementaire;
import com.akkaskills.entities.Langues;
import com.akkaskills.entities.ProjetEffectue;

@SpringBootApplication
public class AkkaskillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkkaskillsApplication.class, args);
	}
	@Bean
	CommandLineRunner starter(LanguesRepository languesRepoistory, DiplomeRepository diplomeRepository,
			FormationComplementaireRepository formationComplementaireRepository,FormationAcquisTechniquesRepository formationAcquisTechniquesRepository, 
			ProjetEffectueRepository projetEffectueRepository,FicheCompetenceRepository ficheCompetenceRepository){
		return args->{
			languesRepoistory.deleteAll();
			Stream.of("L1 Francais Intermediaire","L2 Anglais Expert","L3 Espagnol Intermediaire").forEach(langue->
			languesRepoistory.save(new Langues(langue.split(" ")[0],langue.split(" ")[1],langue.split(" ")[2])));
			languesRepoistory.findAll().forEach(System.out::println);
			
			diplomeRepository.deleteAll();
			
			Stream.of("D1 2012 Licence Yaoundé", "D2 2005 Baccalureat Mbalmayo","D3 2013 Maitrise Inde").forEach(diplome->{
				diplomeRepository.save(new Diplome(diplome.split(" ")[0],diplome.split(" ")[1],diplome.split(" ")[2],diplome.split(" ")[3]));
				diplomeRepository.findAll().forEach(System.out::println);
			});
			
			formationComplementaireRepository.deleteAll();
			
			Stream.of("F1 2019 5ans GenieInformatique UniversitéParisII","F2 2017 4ans GenieInformatique PolytechNantes","F1 2016 3ans GénieCivil UniversitéRennes").forEach(formationComplementaire->{
				formationComplementaireRepository.save(new FormationComplementaire(formationComplementaire.split("")[0],formationComplementaire.split("")[1],formationComplementaire.split("")[2],formationComplementaire.split("")[3],formationComplementaire.split("")[4]));
				formationComplementaireRepository.findAll().forEach(System.out::println);
			});
			
			formationAcquisTechniquesRepository.deleteAll();
//			Stream.of("FA1 "+ls).forEach(formationAcquise->{
//				//formationAcquisTechniquesRepository.save(new FormationAcquisTechniques(formationAcquise.split(" ")[0],formationAcquise.split(" ")[1],formationAcquise.split(" ")[0],formationAcquise.split(" ")[0]));
//			});
			
			projetEffectueRepository.deleteAll();
			
			DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
			
			projetEffectueRepository.save(new ProjetEffectue("P1","Bouygues Construction","Ile Maurice",df.parse("12-02-2000"),df.parse("12-03-2003"),"Ingénieur d'Etudes JEE","Realisation d'une plateforme de management de projet","voir le marché","","Spring cloud, Java 8, Angular 7"));
			projetEffectueRepository.save(new ProjetEffectue("P2","Credi Agricole","Cameroun",df.parse("12-02-2000"),df.parse("12-03-2003"),"Ingénieur d'Etudes JEE","Realisation d'une plateforme de management de projet","voir le marché","","Spring cloud, Java 8, Angular 7"));
			projetEffectueRepository.save(new ProjetEffectue("P3","TKM","France",df.parse("12-02-2000"),df.parse("12-03-2003"),"Ingénieur d'Etudes JEE","Realisation d'une plateforme de management de projet","voir le marché","","Spring cloud, Java 8, Angular 7"));
			projetEffectueRepository.save(new ProjetEffectue("P4","Banque Postal","France",df.parse("12-02-2000"),df.parse("12-03-2003"),"Ingénieur d'Etudes JEE","Realisation d'une plateforme de management de projet","voir le marché","","Spring cloud, Java 8, Angular 7"));
			projetEffectueRepository.save(new ProjetEffectue("P1","Atos","France",df.parse("12-02-2000"),df.parse("12-03-2003"),"Ingénieur d'Etudes JEE","Realisation d'une plateforme de management de projet","voir le marché","","Spring cloud, Java 8, Angular 7"));
			projetEffectueRepository.findAll().forEach(System.out::println);
			
			// Formation Acquise et Technique
			Langues ls=new Langues();
			ls.setId("L11");
			ls.setLabel("Francais");
			ls.setNiveau("Intermediaire");
			Diplome d=new Diplome();
			d.setAnneeOptentionDiplome("2012");
			d.setId("L2");
			d.setLieu("Santchou");
			d.setNameDiplome("Doctorat");
			FormationComplementaire fd=new FormationComplementaire();
			fd.setAnneeOptention("20154");
			fd.setDureeFormation("125463");
			fd.setIntituleFormation("dedede");
			fd.setOrganismeFormation("dedededed");
			formationAcquisTechniquesRepository.save(new FormationAcquisTechniques("FAC1", ls, d, fd));
			formationAcquisTechniquesRepository.save(new FormationAcquisTechniques("FAC2", ls, d, fd));
			formationAcquisTechniquesRepository.save(new FormationAcquisTechniques("FAC3", ls, d, fd));
			formationAcquisTechniquesRepository.save(new FormationAcquisTechniques("FAC4", ls, d, fd));
			formationAcquisTechniquesRepository.save(new FormationAcquisTechniques("FAC5", ls, d, fd));
			formationAcquisTechniquesRepository.findAll().forEach(System.out::println);
			
			ficheCompetenceRepository.deleteAll();
			ProjetEffectue projetEffectue=new ProjetEffectue() ;
			Diplome diplome1=new Diplome();
			FormationComplementaire formationComplementaire1=new FormationComplementaire();
			formationComplementaire1.setIntituleFormation("Universite de Yaoundé 1");
			diplome1.setNameDiplome("Licence");
			FormationAcquisTechniques formationAcquisTechniques=new FormationAcquisTechniques();
			Langues ls1=new Langues();
			ls1.setLabel("Francais");
			projetEffectue.setId("PE1");
			projetEffectue.setEnvironnementTechnique("");
			projetEffectue.setNomClient("Robert TEYEMLONG");
			formationAcquisTechniques.setDiplome(diplome1);
			formationAcquisTechniques.setComplementaire(formationComplementaire1);
			formationAcquisTechniques.setLangues(ls1);
			ficheCompetenceRepository.save(new FicheCompetence("FC12","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC13","DE2","SE2","MTM2","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC14","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC15","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC16","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC18","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC19","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC20","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC21","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC22","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC23","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.save(new FicheCompetence("FC24","DE1","SE1","MTM1","HA1",projetEffectue,formationAcquisTechniques));
			ficheCompetenceRepository.findAll().forEach(System.out::println);
		};
		
	}

}

