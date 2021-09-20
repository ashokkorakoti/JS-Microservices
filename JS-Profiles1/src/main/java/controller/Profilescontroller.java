package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Entity;
import serviceimpl.ProfileServiceImplementation;
import serviceimpl.ProfileServiceInterface;

@RestController
public class Profilescontroller {
	
@Autowired
private ProfileServiceInterface ProfileServiceImplementation;
	
	@GetMapping(value="getid/profile/{profileId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Entity> getbyid(Long id){
		
		return ProfileServiceImplementation.findById(id);
	}
	

}
