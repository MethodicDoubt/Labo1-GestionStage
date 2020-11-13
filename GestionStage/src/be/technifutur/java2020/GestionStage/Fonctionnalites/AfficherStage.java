package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

public class AfficherStage implements Runnable {

    @Override
    public void run() {

        System.out.println("Voici la liste de tous les stages");

        for (Stage s : StageModel.getListStage()) {

            System.out.println(s.toString());

        }

    }
}
