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

        boolean valid = false;

        //CODE DE SAISIE

        do {

            valid = true;

            System.out.println("- CREER UN NOM POUR LE STAGE");
            nom = entree.nextLine();

            if(!isValid((nom))){

                valid = false;
                System.out.println("Nom de stage déjà utilisé");

            }

        }while(!valid);

        do {

            System.out.println("- CREER UNE DATE DE DEBUT DE STAGE");
            dateDebut = transformDate(entree.nextLine());

        }while(dateDebut == null);

        do {

            System.out.println("- CREER UNE DATE DE FIN DE STAGE");
            dateFin = transformDate(entree.nextLine());

        }while(dateFin == null);


        if (isValid(dateDebut, dateFin)) {

            StageModel.add(new Stage(nom, dateDebut, dateFin));

            System.out.println("<La liste des stages>");

            for (int i = 0; i < StageModel.getListStage().size(); i++) {

                System.out.println(StageModel.getListStage().get(i).toString());

            }

        }

    }

    //TRANSFORMATION DES STRING EN LOCALDATETIME

    public LocalDateTime transformDate (String dateRecue){

        LocalDateTime dateReturn = null;

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

            dateReturn = LocalDateTime.parse(dateRecue, formatter);

        }catch (Exception e){

            System.out.println("Votre date ne respecte pas le format demandé");

        }

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

    public Boolean isValid(String nomEntree) {

        return StageModel.getStageByName(nomEntree) == null;

    }

}
