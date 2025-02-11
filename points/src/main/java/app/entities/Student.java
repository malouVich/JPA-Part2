package app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "student")

public class Student {
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    private String email;
    private String name;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void created(){
        createdAt = LocalDateTime.now();
    }

}