package by.dobrynin.dobrovet.Entity.products;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Medicine")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Medicine extends Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dosage;

    private LocalDateTime ExpirationDate;

    private boolean prescriptionRequired;

}
