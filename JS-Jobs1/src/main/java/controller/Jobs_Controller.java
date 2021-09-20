package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import model.Jobs_Entity;
import services.Jobs_Service_Interface;


@RestController
public class Jobs_Controller {
	@Autowired
	private Jobs_Service_Interface Jobs_Service_Interface;

	@PostMapping(value="save/job",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Jobs_Entity> save(Long id){
		
		return Jobs_Service_Interface.save();
	}
	
	@GetMapping(value="profile/job/search/{jobTitle}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Jobs_Entity> getbytitle(String jobtitle){
		
		return Jobs_Service_Interface.findByJobTitle(jobtitle);
	}
	
	
}
