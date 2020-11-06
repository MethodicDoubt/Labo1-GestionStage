package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class StageModel {

    private static List<Stage> stageList = new ArrayList<>();

    public List<Stage> getListStage (){

        return Collections.unmodifiableList(stageList);

    }

    public static boolean add(Stage stage){

        return stageList.add(stage);

    }


    public static Stage getStage (String nom){

        Stage stage = null;

        for (int i = 0; i < stageList.size() && stage == null; i++){

            if (stageList.get(i).getNom().equals(nom)){

                stage = stageList.get(i);

            }

        }

        return stage;

    }

}
