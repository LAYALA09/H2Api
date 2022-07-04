package ar.com.h2.h2api.persistence.repository;

import ar.com.h2.h2api.persistence.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactertRepository extends JpaRepository<MovieEntity,Long> {
}
