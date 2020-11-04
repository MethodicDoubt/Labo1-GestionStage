package be.technifutur.java2020.GestionStage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CreationStage {

    //---------------------------------------------------------------------- PROPRIETES

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    private String nom;

    //---------------------------------------------------------------------- SETTER

    public void setDateDebut (String dateEntree){

        FormatStyle dateStyle = FormatStyle.FULL;
        FormatStyle timeStyle = FormatStyle.MEDIUM;

        DateTimeFormatter formateur = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);

        this.dateDebut = LocalDateTime.parse(dateEntree, formateur);

    }

    public void setDateFin (String dateEntree){

        FormatStyle dateStyle = FormatStyle.FULL;
        FormatStyle timeStyle = FormatStyle.MEDIUM;

        DateTimeFormatter formateur = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);

        this.dateFin = LocalDateTime.parse(dateEntree, formateur);

    }

    public void setNom(String nom) {

        this.nom = nom;

    }

    //---------------------------------------------------------------------- GETTER

    public LocalDateTime getDateDebut() {

        return dateDebut;

    }

    public LocalDateTime getDateFin() {

        return dateFin;

    }

    public String getNom() {

        return nom;

    }
}
