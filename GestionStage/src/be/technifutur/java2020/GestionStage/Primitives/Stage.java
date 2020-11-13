package be.technifutur.java2020.GestionStage.Primitives;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Stage extends StageModel implements Serializable {

    //---------------------------------------------------------------------- PROPRIETES

    private String nom;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    private String dateDebutFormat;
    private String dateFinFormat;

    private HashMap<String, Activite> mapActivite;

    //------------------------------------------------------------------------ SETTER

    private void setDateDebut (LocalDateTime dateRecue){

        if (dateRecue != null) {

            this.dateDebut = dateRecue;

        }else {

            this.dateDebut = null;

        }

    }

    private void setDateFin (LocalDateTime dateRecue){

        if (dateRecue != null) {

            this.dateFin = dateRecue;

        }else {

            this.dateFin = null;

        }

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

    public Map<String, Activite> getMapActivite (){

        return Collections.unmodifiableMap(mapActivite);

    }

    //----------------------------------------------------------------------- CONSTRUCTEUR

    public Stage(String nom, LocalDateTime dateDebut, LocalDateTime dateFin) {

        setNom(nom);
        setDateDebut(dateDebut);
        setDateFin(dateFin);
        mapActivite = new HashMap<>();

    }


    //----------------------------------------------------------------------------- METHODES

    public void modifierStage(String nom, LocalDateTime dateDebut, LocalDateTime dateFin) {

        setNom(nom);
        setDateDebut(dateDebut);
        setDateFin(dateFin);

    }

    public void stringification (){

        if (dateDebut != null && dateFin != null) {

            this.dateDebutFormat = this.dateDebut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm", Locale.FRENCH));
            this.dateFinFormat = this.dateFin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm", Locale.FRENCH));

        }

    }

    public void addActivite (Activite a){

        this.mapActivite.put(a.getName(), a);

    }

    public Activite getActiviteByName (String s){

        Activite activite;

        activite = this.getMapActivite().get(s);

        return activite;

    }

    public void remove(String s){

        mapActivite.remove(s);

    }

    //------------------------------------------------------------------------------- METHODE D'INTERFACE

    @Override
    public String toString() {

        String chaine;

        stringification();

        chaine = "---------------------------------------------------------------------------------------------------------------------------------" +
                "\n" +
                "Nom du Stage : " + this.nom + "\n" + "Date de début du stage : " + dateDebutFormat + " \n" + "Date de fin du stage : " + dateFinFormat
                + "\n" + "------------------------------------------------------------------------------------------------------------------------------";

        return chaine;

    }

}
