package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.User.User;
import be.technifutur.java2020.GestionStage.Utils.DateUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AjouterActivite implements Runnable {

    private User user;

    @Override
    public void run() {

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

            if (!isValid((nom))) {

                valid = false;
                System.out.println("Nom d'activité déjà utilisé");

            }

        } while (!valid);

        do {

            System.out.println("- Créez un date de début d'activité selon le format : JJ-MM-AAAA HH:MM");
            dateDebut = DateUtils.transformDate(entree.nextLine());

        } while (dateDebut == null);

        do {

            System.out.println("- Entrez la durée de l'activité en minutes");
            duree = Duration.ofMinutes(Long.parseLong(entree.nextLine()));

        } while (duree == null);


        if (isValid(dateDebut, duree)) {

            user.getStageSelectionne().addActivite(new Activite(nom, dateDebut, duree));

            StageModel.Sauvegarde();

            System.out.println("<Le stage sur lequel vous travaillez>");


            System.out.println(user.getStageSelectionne().toString());

            for (Activite a : user.getStageSelectionne().getMapActivite().values()) {

                System.out.println(a.afficherActivite());

            }

        }

    }

    public Boolean isValid(LocalDateTime dateDebut, Duration duree) {

        Boolean valid = false;

        if (dateDebut.compareTo(user.getStageSelectionne().getDateDebut()) >= 0) {

            valid = true;
            return valid;

        } else {

            return valid;

        }

    }

    public Boolean isValid(String nomEntree) {

        return user.getStageSelectionne().getActiviteByName(nomEntree) == null;

    }

    public void setStage(Stage stageSelectionne) {

        user.setStageSelectionne(stageSelectionne);

    }

    public AjouterActivite(User user) {

        this.user = user;

    }
}
