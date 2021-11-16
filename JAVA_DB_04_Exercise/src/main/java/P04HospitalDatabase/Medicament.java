package P04HospitalDatabase;

import P01Gringotts.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "medicaments")
public class Medicament extends BaseEntity {
    private String name;


    private Set<Patient> patients;

    public Medicament() {
        this.patients = new HashSet<>();
    }

    @Column(name = "medicament_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "medicaments")
    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}