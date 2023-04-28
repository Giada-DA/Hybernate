package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
public class Enrollment{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    public Student student;

    @ManyToOne
    public SchoolClass schoolClass;

}