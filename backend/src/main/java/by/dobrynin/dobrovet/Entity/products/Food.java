package by.dobrynin.dobrovet.Entity.products;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "food")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Food extends Product{

    private int weight;

    private String petType;

    private String foodType;
}
