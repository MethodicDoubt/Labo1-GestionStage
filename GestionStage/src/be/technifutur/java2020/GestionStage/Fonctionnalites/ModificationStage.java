package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireStage;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.List;

public class ModificationStage {

    //------------------------------------------------------------------------ PROPRIETES

    private List<Stage> stageList = GestionnaireStage.getStageList();

    //------------------------------------------------------------------------- METHOD

    public void setStage(List<Stage> stageList, int index, String nom, String dateDebut, String dateFin){

        stageList.get(index).modifierStage(nom, dateDebut, dateFin);

    }

}
