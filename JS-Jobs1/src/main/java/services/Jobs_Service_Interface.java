package services;

import java.util.Optional;

import model.Jobs_Entity;

public interface Jobs_Service_Interface {

	//Optional<Jobs_Entity> findById(Long id);

	Optional<Jobs_Entity> save();

	//Optional<Jobs_Entity> findByJobTitle(Long id);

	//Optional<Jobs_Entity> findByJobTitle(String jobtitle);

//	Optional<Jobs_Entity> findByJobTitle(Long id);

	//Optional<Jobs_Entity> findByJobTitle();

	Optional<Jobs_Entity> findByJobTitle(String jobtitle);

}
