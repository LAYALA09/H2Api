package ar.com.h2.h2api.persistence.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String descripcion;
    private LocalDateTime createdate;
    private LocalDateTime eta;
    private boolean finished;
    private TaskStatus taskStatus;

}
