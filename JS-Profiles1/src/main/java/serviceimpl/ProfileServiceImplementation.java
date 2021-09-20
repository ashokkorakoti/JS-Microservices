package serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Entity;

@Service
public class ProfileServiceImplementation<ProfileRepository> implements ProfileServiceInterface {
	@Autowired
	private ProfileRepository ProfileRepository;
	

	@Override
	public Optional<Entity> findById(Long id) {
		// TODO Auto-generated method stub
		return  ((ProfileServiceInterface) ProfileRepository).findById(id);
	}

}
