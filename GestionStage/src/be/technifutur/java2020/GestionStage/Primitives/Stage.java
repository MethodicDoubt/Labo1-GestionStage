package be.technifutur.java2020.GestionStage.Primitives;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Stage extends StageModel {

    //---------------------------------------------------------------------- PROPRIETES

    private String nom;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    //------------------------------------------------------------------------ SETTER

    private void setDateDebut (String dateEntree){

        FormatStyle dateStyle = FormatStyle.FULL;
        FormatStyle timeStyle = FormatStyle.MEDIUM;

        DateTimeFormatter formateur = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);

        this.dateDebut = LocalDateTime.parse(dateEntree, formateur);

    }

    private void setDateFin (String dateEntree){

        FormatStyle dateStyle = FormatStyle.FULL;
        FormatStyle timeStyle = FormatStyle.MEDIUM;

        DateTimeFormatter formateur = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);

        this.dateFin = LocalDateTime.parse(dateEntree, formateur);

    }

    private void setNom(String nom) {

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

    //----------------------------------------------------------------------- CONSTRUCTEUR

    public Stage(String nom, String dateDebut, String dateFin) {

        setNom(nom);
        setDateDebut(dateDebut);
        setDateFin(dateFin);

    }


    //----------------------------------------------------------------------------- METHODE INTERFACE

    @Override
    public void modifierStage(String nom, String dateDebut, String dateFin) {

        setDateDebut(nom);
        setDateFin(dateDebut);
        setNom(dateFin);

    }

}
