package be.technifutur.java2020.GestionStage.Fonctionnalites;


import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireStage;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.ArrayList;
import java.util.List;

public class CreationStage {

    //------------------------------------------------------------------------ PROPRIETES

    private static List<Stage> stageList = GestionnaireStage.getStageList();

    //------------------------------------------------------------------------- METHOD

    public static void ajoutStage(String nom, String dateDebut, String dateFin){

        stageList.add(new Stage(nom, dateDebut, dateFin));

    }

}
