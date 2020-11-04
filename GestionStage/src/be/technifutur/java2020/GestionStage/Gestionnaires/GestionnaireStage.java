package be.technifutur.java2020.GestionStage.Gestionnaires;

import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireStage {

    private static List<Stage> StageList = new ArrayList<>();

    public static List<Stage> getStageList() {

        return StageList;

    }
}
