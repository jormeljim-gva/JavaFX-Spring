package app.JavaFxTeacherApplication.Departament;
import app.JavaFxTeacherApplication.Teacher.Teacher;
import jakarta  .persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "departament")
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Departament() {
    }

    public Departament(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "departament", orphanRemoval = true)
    private Set<Teacher> teachers = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  String toString() {
        return name;
    }
}