package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Fonctionnalites.CreationStage;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.AjouterActivite;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.ModifierActivite;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.RetirerActivite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireSelectionnerSousFonctionnalite;

import java.util.HashMap;

public class SelectionnerSousFonctionnaliteModel {

    HashMap<GestionnaireSelectionnerSousFonctionnalite, ActionStage> mapSelectionnerSousFonctionnalite = new HashMap<>();

    public SelectionnerSousFonctionnaliteModel() {

        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.AJOUTER, new AjouterActivite());
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.AJOUTER, new RetirerActivite());
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.AJOUTER, new ModifierActivite());

    }

    public Runnable getSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g) {

        return mapSelectionnerSousFonctionnalite.get(g);

    }

    public void addSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g, Runnable r) {

        mapSelectionnerSousFonctionnalite.put(g, r);

    }

}
