package serviceimpl;



import java.util.List;
import java.util.Optional;

import model.Entity;

public interface ProfileServiceInterface {
	//Optional < Entity > findById(Long id);

	Optional<Entity> findById(Long id);

}
