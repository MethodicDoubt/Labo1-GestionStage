package be.technifutur.java2020.GestionStage.Fonctionnalites;


import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.Scanner;

public class ModificationStage implements Runnable {

    //------------------------------------------------------------------------ PROPRIETES



    //------------------------------------------------------------------------- METHOD

    public void run(){

        String name = "";
        String newName = "";
        String dateDebut = "";
        String dateFin = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("<La liste des stages>");

        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

        System.out.println("Entrez le nom du stage que vous voulez modifier");

        name = scanner.nextLine();



        System.out.println(StageModel.getStageByName(name).toString());

        System.out.println("Entrez le nouveau nom du stage");

        newName = scanner.nextLine();

        System.out.println("Entrez la nouvelle date de début du stage selon le format : jj-mm-aaaa hh:mm");

        dateDebut = scanner.nextLine();

        System.out.println("Entrez la nouvelle date de fin du stage selon le format : jj-mm-aaaa hh:mm");

        dateFin = scanner.nextLine();

        StageModel.getStageByName(name).modifierStage(newName, StageModel.getStageByName(name).transformDate(dateDebut),
                                                        StageModel.getStageByName(name).transformDate(dateFin));

        System.out.println("Voici la liste des stages");

        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

    }

}
