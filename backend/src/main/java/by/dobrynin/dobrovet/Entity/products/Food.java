package by.dobrynin.dobrovet.Entity.products;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Food")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Food extends Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int weight;

    private String petType;

    private String foodType;
}
