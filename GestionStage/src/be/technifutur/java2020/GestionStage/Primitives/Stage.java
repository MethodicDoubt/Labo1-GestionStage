package be.technifutur.java2020.GestionStage.Primitives;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Stage extends StageModel {

    //---------------------------------------------------------------------- PROPRIETES

    private String nom;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    //---------------------------------------------------------------------- METHODES

    public LocalDateTime transformDate (String dateRecue){

        LocalDateTime dateReturn;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        dateReturn = LocalDateTime.parse(dateRecue, formatter);

        return dateReturn;

    }

    //------------------------------------------------------------------------ SETTER

    private void setDateDebut (String dateRecue){

        this.dateDebut = transformDate(dateRecue);

    }

    private void setDateFin (String dateRecue){

        this.dateFin = transformDate(dateRecue);

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

    @Override
    public String toString() {

        String chaine;

        chaine = "Nom du Stage : " + this.nom + " /  Date de début du stage : " + dateDebut.toString() + " /  Date de fin du stage : " + dateFin.toString();

        return chaine;

    }
}
