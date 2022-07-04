package ar.com.h2.h2api.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="task")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String descripcion;
    private LocalDateTime createdate;
    private LocalDateTime eta;
    private boolean finished;
    private CharacterEntity taskStatus;

}
