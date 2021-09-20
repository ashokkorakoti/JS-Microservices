package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Jobs_Entity;

@Repository
public interface Jobs_Interrface extends JpaRepository<Jobs_Entity, Long> {

}
