package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireStage;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.List;
import java.util.Scanner;

public class SéléctionnerStage implements Runnable{

    private Stage stageSelectionne;

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        String entree;




        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

        System.out.println("Entre le nom du stage sur lequel vous voulez agir");

        entree = scanner.nextLine();

        this.stageSelectionne = StageModel.getStageByName(entree);

        System.out.println("Sélectionnez le numéro de l'action que vous souhaitez effectuer");

        entree = scanner.nextLine();



    }

    public Stage getStageSelectionne() {
        return stageSelectionne;
    }
}
