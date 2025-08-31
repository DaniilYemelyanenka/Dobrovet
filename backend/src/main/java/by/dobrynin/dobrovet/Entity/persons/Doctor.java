package by.dobrynin.dobrovet.Entity.persons;

import by.dobrynin.dobrovet.Entity.Appointment;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="doctors")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Doctor extends Person{

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointmentList;
}
