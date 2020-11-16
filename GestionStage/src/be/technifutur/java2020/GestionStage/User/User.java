package be.technifutur.java2020.GestionStage.User;

import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Personne;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

public class User {

    private Stage stageSelectionne;
    private Activite activiteSelectionne;
    private Personne personneSelectionne;

    public Stage getStageSelectionne() {

        return stageSelectionne;

    }

    public void setStageSelectionne(Stage stageSelectionne) {

        this.stageSelectionne = stageSelectionne;

    }

    public Activite getActiviteSelectionne() {

        return activiteSelectionne;

    }

    public void setActiviteSelectionne(Activite activiteSelectionne) {

        this.activiteSelectionne = activiteSelectionne;

    }

    public Personne getPersonneSelectionne() {

        return personneSelectionne;

    }

    public void setPersonneSelectionne(Personne personneSelectionne) {

        this.personneSelectionne = personneSelectionne;

    }

}
