package by.dobrynin.dobrovet.Entity.products;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "medicine")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Medicine extends Product{

    private String dosage;

    private LocalDateTime ExpirationDate;

    private boolean prescriptionRequired;

}
