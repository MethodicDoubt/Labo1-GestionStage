package be.technifutur.java2020.GestionStage.Fonctionnalites;


import be.technifutur.java2020.GestionStage.DB.BaseDeDonnees;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.User.User;
import be.technifutur.java2020.GestionStage.Utils.DateUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CreationStage implements Runnable {

    //------------------------------------------------------------------------ PROPRIETES

    private User user;

    //------------------------------------------------------------------------- METHOD
    @Override
    public void run() {

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

            if (!isValid((nom))) {

                valid = false;
                System.out.println("Nom de stage déjà utilisé");

            }

        } while (!valid);

        do {

            System.out.println("- CREER UNE DATE DE DEBUT DE STAGE SELON LE FORMAT : JJ-MM-AAAA HH:MM");
            dateDebut = DateUtils.transformDate(entree.nextLine());

        } while (dateDebut == null);

        do {

            System.out.println("- CREER UNE DATE DE FIN DE STAGE SELON LE FORMAT : JJ-MM-AAAA HH:MM");
            dateFin = DateUtils.transformDate(entree.nextLine());

        } while (dateFin == null);


        if (isValid(dateDebut, dateFin)) {

            StageModel.add(new Stage(nom, dateDebut, dateFin));

            System.out.println("<La liste des stages>");

            for (int i = 0; i < StageModel.getListStage().size(); i++) {

                System.out.println(StageModel.getListStage().get(i).toString());

            }

        }

    }

    public Boolean isValid(LocalDateTime dateDebut, LocalDateTime dateFin) {

        Boolean valid = false;

        if (dateDebut.isBefore(dateFin)) {

            valid = true;
            return valid;

        } else {

            return valid;

        }

    }

    public Boolean isValid(String nomEntree) {

        return StageModel.getStageByName(nomEntree) == null;

    }

    public CreationStage(User user) {

        this.user = user;

    }
}
