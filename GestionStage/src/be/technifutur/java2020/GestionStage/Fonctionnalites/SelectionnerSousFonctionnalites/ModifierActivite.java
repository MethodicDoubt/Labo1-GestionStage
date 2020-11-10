package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.ActionStage;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

public class ModifierActivite implements ActionStage {

    private Stage stageSelectionne;

    @Override
    public void run() {

    }

    public void setStage(Stage stageSelectionne) {
        this.stageSelectionne = stageSelectionne;
    }

}
