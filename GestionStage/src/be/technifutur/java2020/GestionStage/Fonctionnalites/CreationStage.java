package be.technifutur.java2020.GestionStage.Fonctionnalites;


import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CreationStage implements Runnable{

    //------------------------------------------------------------------------ PROPRIETES



    //------------------------------------------------------------------------- METHOD
    @Override
    public void run(){

        String nom;
        LocalDateTime dateDebut;
        LocalDateTime dateFin;

        String dateEntreeDebut;
        String dateEntreeFin;

        Scanner entree = new Scanner(System.in);

        //CODE DE SAISIE

        System.out.println("- CREER UN NOM POUR LE STAGE");
        nom = entree.nextLine();

        System.out.println("- CREER UNE DATE DE DEBUT DE STAGE");
        dateDebut = transformDate(entree.nextLine());

        System.out.println("- CREER UNE DATE DE FIN DE STAGE");
        dateFin = transformDate(entree.nextLine());

        while (isValid(dateDebut, dateFin)) {

            StageModel.StageList.add(new Stage(nom, dateDebut, dateFin));

        }

    }

    //TRANSFORMATION DES STRING EN LOCALDATETIME

    public LocalDateTime transformDate (String dateRecue){

        LocalDateTime dateReturn;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        dateReturn = LocalDateTime.parse(dateRecue, formatter);

        return dateReturn;

    }

    public Boolean isValid(LocalDateTime dateDebut, LocalDateTime dateFin){

        Boolean valid = false;

        if (dateDebut.isBefore(dateFin)) {

            valid = true;
            return valid;

        }else {

            return valid;

        }

    }

}
