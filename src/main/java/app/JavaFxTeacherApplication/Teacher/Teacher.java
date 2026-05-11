package app.JavaFxTeacherApplication.Teacher;

import app.JavaFxTeacherApplication.Departament.Departament;
import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;      // Columna ID, se genera sola (1, 2, 3...)

    private String name;  // Columna nombre

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne            // Un profesor pertenece a UN departamento
    @JoinColumn(name = "departament_id")
    private Departament departament;

    @Override
    public String toString() {
        return name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
