package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireStage;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.time.LocalDateTime;
import java.util.List;

public class ModificationStage implements Runnable {

    //------------------------------------------------------------------------ PROPRIETES



    //------------------------------------------------------------------------- METHOD

    public void run(List<Stage> stageList, int index, String nom, LocalDateTime dateDebut, LocalDateTime dateFin){

        StageModel.StageList.get(index).modifierStage(nom, dateDebut, dateFin);

    }

}
