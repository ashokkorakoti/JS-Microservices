package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Jobs_Entity;

@Service
public class Jobs_Service_Implementation<Jobs_Interrface> implements Jobs_Service_Interface {
@Autowired
private Jobs_Interrface Jobs_Interrface; 
	
	@Override
	public Optional<Jobs_Entity> save() {
		// TODO Auto-generated method stub
		return ((Jobs_Service_Interface) Jobs_Interrface).save();
	}


	


	@Override
	public Optional<Jobs_Entity> findByJobTitle(String jobtitle) {
		// TODO Auto-generated method stub
		return ((Jobs_Service_Interface) Jobs_Interrface).findByJobTitle(jobtitle);
	}

}
