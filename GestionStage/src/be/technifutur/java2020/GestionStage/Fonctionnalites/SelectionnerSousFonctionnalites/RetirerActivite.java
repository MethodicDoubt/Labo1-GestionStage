package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.ActionStage;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.Scanner;

public class RetirerActivite implements ActionStage {

    private Stage stageSelectionne;

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        String name;
        Activite activiteToRemoved;

        if (!Stage.getListStage().isEmpty()) {

            System.out.println("<Voici la liste des activités>");

            for (Activite a : stageSelectionne.getMapActivite().values()) {

                System.out.println(a.afficherActivite());

            }

            System.out.println("Entrez le nom de l'activité que vous voulez retirer");

            name = scanner.nextLine();

            activiteToRemoved = stageSelectionne.getActiviteByName(name);

            System.out.println("Suppression de : " + activiteToRemoved.getName());

            stageSelectionne.remove(name);

            System.out.println("<Voici la nouvelle liste des activités de ce stage>");

            for (Activite a : stageSelectionne.getMapActivite().values()) {

                System.out.println(a.afficherActivite());

            }

        } else {

            System.out.println("Il n'y a pas d'activité programmée pour le moment");

        }

    }

    public void setStage(Stage stageSelectionne) {
        this.stageSelectionne = stageSelectionne;
    }

}
