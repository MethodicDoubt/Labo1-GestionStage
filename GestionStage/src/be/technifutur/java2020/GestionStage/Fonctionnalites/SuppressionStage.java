package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.Scanner;

public class SuppressionStage implements Runnable{

    @Override
    public void run(){

        Scanner scanner = new Scanner(System.in);
        String name;
        Stage stageToRemoved;

        System.out.println("<Voici la liste des stages>");

        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

        System.out.println("Entrez le nom du stage que vous voulez supprimer");

        name = scanner.nextLine();

        stageToRemoved = StageModel.getStageByName(name);

        StageModel.remove(stageToRemoved);

        System.out.println("<Voici la nouvelle liste des stages>");

        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

    }

}
