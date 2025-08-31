package by.dobrynin.dobrovet.Entity.persons;

import by.dobrynin.dobrovet.Entity.Appointment;
import by.dobrynin.dobrovet.Entity.Order;
import by.dobrynin.dobrovet.Entity.Pet;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="clients")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Client extends Person{


    @OneToMany(mappedBy = "client")
    private List<Order> ordersList;

    @OneToMany(mappedBy = "client")
    private List<Pet> petsList;

    @OneToMany(mappedBy = "client")
    private List<Appointment> appointmentList;

}
