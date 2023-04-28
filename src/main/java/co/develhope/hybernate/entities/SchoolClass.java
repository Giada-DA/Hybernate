package co.develhope.hybernate.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClass{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull
    public String materia;
    @NotNull
    public String descrizione;

}