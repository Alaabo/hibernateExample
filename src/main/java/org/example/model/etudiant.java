package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "etudiant")
public class etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;
    @Column(name = "intero")
    private float intero;
    @Column(name="control")
    private float control;

    public etudiant() {
    }



    public etudiant(int id, String name, float intero, float control) {
        this.id = id;
        this.name = name;
        this.intero = intero;
        this.control = control;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIntero() {
        return intero;
    }

    public void setIntero(float intero) {
        this.intero = intero;
    }

    public float getControl() {
        return control;
    }

    public void setControl(float control) {
        this.control = control;
    }
}
