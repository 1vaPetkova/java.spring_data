package course.springData.hibernateIntro.entity;

import java.util.Date;
import java.util.Objects;

public class Student {
    private Long id;
    private String name;
    private Date registrationDate;

    public Student(String name) {
        this.name = name;
        this.registrationDate = new Date();
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", registrationDate=").append(registrationDate);
        sb.append('}');
        return sb.toString();
    }
}
