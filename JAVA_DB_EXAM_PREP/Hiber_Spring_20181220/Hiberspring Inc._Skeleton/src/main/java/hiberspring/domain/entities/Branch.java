package hiberspring.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "branches")
public class Branch extends BaseEntity {

    private String name;
    private Town town;
    private Set<Employee> employee;
    private Set<Product> products;

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(optional = false)
    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @OneToMany(mappedBy = "branch")
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @OneToMany(mappedBy = "branch")
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
