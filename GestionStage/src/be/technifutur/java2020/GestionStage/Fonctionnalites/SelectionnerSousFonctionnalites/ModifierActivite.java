package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.ActionStage;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.Utils.DateUtils;
import be.technifutur.java2020.GestionStage.Utils.DurationUtils;

import java.util.Scanner;

public class ModifierActivite implements ActionStage {

    private Stage stageSelectionne;

    @Override
    public void run() {

        String name = "";
        String newName = "";
        String dateDebut = "";
        String duree = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("<La liste des activités>");

        if (!stageSelectionne.getMapActivite().isEmpty()){

            for (Activite a : stageSelectionne.getMapActivite().values()) {

                System.out.println(a.afficherActivite());

            }

            System.out.println("Entrez le nom de l'activité que vous voulez modifier");

            name = scanner.nextLine();

            if (stageSelectionne.getActiviteByName(name) != null) {

                System.out.println("Activité sélectionnée : " + stageSelectionne.getActiviteByName(name).afficherActivite());

                System.out.println("Entrez le nouveau nom de l'activité");

                newName = scanner.nextLine();

                System.out.println("Entrez la nouvelle date de début de l'activité selon le format : jj-mm-aaaa hh:mm");

                dateDebut = scanner.nextLine();

                System.out.println("Entrez la nouvelle durée de l'activité (en minutes)");

                duree = scanner.nextLine();

                stageSelectionne.getActiviteByName(name).modifierActivite(newName, DateUtils.transformDate(dateDebut), DurationUtils.transformDuration(duree));

                System.out.println("Voici la liste des activités");

                for (Activite a : stageSelectionne.getMapActivite().values()) {

                    System.out.println(a.afficherActivite());

                }

            }

        } else {

            System.out.println("Il n'y a pas d'activités programmées'");

        }

    }

    public void setStage(Stage stageSelectionne) {
        this.stageSelectionne = stageSelectionne;
    }

}
