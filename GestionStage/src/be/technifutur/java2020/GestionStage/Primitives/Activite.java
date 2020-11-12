package be.technifutur.java2020.GestionStage.Primitives;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;

public class Activite {

    //--------------------------------------------------------------------------- PROPRIETES

    private String name;
    private LocalDateTime dateDebut;
    private Duration duree;

    //---------------------------------------------------------------------------

    public Activite (String name, LocalDateTime dateDebut, Duration duree){

        this.name = name;
        this.dateDebut = dateDebut;
        this.duree = duree;

    }

    //---------------------------------------------------------------------------- GETTER

    public String getName() {

        return name;

    }

    public LocalDateTime getDateDebut() {

        return dateDebut;

    }

    public Duration getDuree() {

        return duree;

    }

    //---------------------------------------------------------------------------- SETTER

    public void setName(String name) {

        this.name = name;

    }

    public void setDateDebut(LocalDateTime dateDebut) {

        this.dateDebut = dateDebut;

    }

    public void setDuree(Duration duree) {

        this.duree = duree;

    }

    //----------------------------------------------------------------------------- METHODE

    public String afficherActivite (){

        String chaine;

        chaine = "               --------------------------------------------------------------------------------------------------------------------------------"
                + "\n" +
                "               | Nom de l'activité : " + this.name
                + "\n" +
                "               | Date et heure du début de l'activité : " + dateDebut
                + "\n" +
                "               | Durée : " + duree
                + "\n" +
                "                --------------------------------------------------------------------------------------------------------------------------------";

        return chaine;

    }

}
