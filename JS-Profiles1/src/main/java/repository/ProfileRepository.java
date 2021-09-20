package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import model.Entity;

@Repository
public interface ProfileRepository extends JpaRepository<Entity, Long> {
public Optional<Entity> findById(Long id);

}
