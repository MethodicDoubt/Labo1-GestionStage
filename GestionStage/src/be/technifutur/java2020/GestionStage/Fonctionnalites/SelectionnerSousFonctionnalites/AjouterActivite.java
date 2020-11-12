package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerStage;
import be.technifutur.java2020.GestionStage.Modeles.ActionStage;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.Utils.DateUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

public class AjouterActivite implements ActionStage {

    private Stage stageSelectionne;

    @Override
    public void run(){

        String nom;
        LocalDateTime dateDebut;
        Duration duree;

        String dateEntreeDebut;
        String dureeEntree;

        Scanner entree = new Scanner(System.in);

        boolean valid = false;

        //CODE DE SAISIE

        do {

            valid = true;

            System.out.println("- Créez un nom pour l'activité'");
            nom = entree.nextLine();

            if(!isValid((nom))){

                valid = false;
                System.out.println("Nom d'activité déjà utilisé");

            }

        }while(!valid);

        do {

            System.out.println("- Créez un date de début d'activité selon le format : JJ-MM-AAAA HH:MM");
            dateDebut = DateUtils.transformDate(entree.nextLine());

        }while(dateDebut == null);

        do {

            System.out.println("- Entrez la durée de l'activité en minutes");
            duree = Duration.ofMinutes(Long.parseLong(entree.nextLine()));

        }while(duree == null);


        if (isValid(dateDebut, duree)) {

            stageSelectionne.addActivite(new Activite(nom, dateDebut, duree));

            System.out.println("<La liste des stages>");

            for (int i = 0; i < StageModel.getListStage().size(); i++) {

                System.out.println(StageModel.getListStage().get(i).toString());

                for (Activite a : stageSelectionne.getMapActivite().values()) {

                    System.out.println(a.afficherActivite());

                }

            }

        }

    }

    public Boolean isValid(LocalDateTime dateDebut, Duration duree){

        Boolean valid = false;

        if (dateDebut.compareTo(stageSelectionne.getDateDebut()) >= 0) {

            valid = true;
            return valid;

        }else {

            return valid;

        }

    }

    public Boolean isValid(String nomEntree) {

        return stageSelectionne.getActiviteByName(nomEntree) == null;

    }

    public void setStage(Stage stageSelectionne) {

        this.stageSelectionne = stageSelectionne;

    }
}
