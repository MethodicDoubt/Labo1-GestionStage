package be.technifutur.java2020.GestionStage.Primitives;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Personne implements Serializable {

    private String nom = "";
    private String prenom = "";

    private int Age;

    private List<Stage> listeInscriptionStage;
    private List<Activite> listeInscriptionActivite;

    //-----------------------------------------------------------------------------------SETTER


    public void setNom(String nom) {

        this.nom = nom;

    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;

    }

    public void setAge(int age) {

        Age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Age == personne.Age &&
                Objects.equals(nom, personne.nom) &&
                Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nom, prenom, Age);

    }
}
