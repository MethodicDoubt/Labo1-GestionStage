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

    //------------------------------------------------------------------------ SETTER

    private void setDateDebut (LocalDateTime dateRecue){

        this.dateDebut = dateRecue;

    }

    private void setDateFin (LocalDateTime dateRecue){

        this.dateFin = dateRecue;

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

    public Stage(String nom, LocalDateTime dateDebut, LocalDateTime dateFin) {

        setNom(nom);
        setDateDebut(dateDebut);
        setDateFin(dateFin);

    }


    //----------------------------------------------------------------------------- METHODE INTERFACE

    public void modifierStage(String nom, LocalDateTime dateDebut, LocalDateTime dateFin) {

        setNom(nom);
        setDateDebut(dateDebut);
        setDateFin(dateFin);

    }

    @Override
    public String toString() {

        String chaine;

        chaine = "Nom du Stage : " + this.nom + " /  Date de début du stage : " + dateDebut.toString() + " /  Date de fin du stage : " + dateFin.toString();

        return chaine;

    }
}
