package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Personne;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participation implements Serializable {

    //Liste d'activités
    //Une personne

    private List<Activite> listeActiviteParticipation = new ArrayList<>();

    private Personne inscrit;

    private Stage stageSelectionne;

    //--------------------------------------------------------------------------------------- CONSTRUCTEUR

    public Participation(Personne inscrit) {

        this.inscrit = inscrit;

    }

    //---------------------------------------------------------------------------------------------- GETTER

    public List<Activite> getListeActiviteParticipation() {

        return Collections.unmodifiableList(listeActiviteParticipation);

    }

    public Personne getInscrit() {

        return inscrit;

    }

    //------------------------------------------------------------------------------------------- SETTER


    public void setStageSelectionne(Stage stageSelectionne) {

        this.stageSelectionne = stageSelectionne;

    }

    //--------------------------------------------------------------------------------------------

    public void addActiviteParticipation(Activite activiteParticipation) {

        this.listeActiviteParticipation.add(activiteParticipation);

    }

    public void removeActiviteParticipation(String name){

        this.listeActiviteParticipation.remove(stageSelectionne.getActiviteByName(name));

    }

}
