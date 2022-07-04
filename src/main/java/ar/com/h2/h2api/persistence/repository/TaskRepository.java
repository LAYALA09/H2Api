package ar.com.h2.h2api.persistence.repository;

import ar.com.h2.h2api.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
