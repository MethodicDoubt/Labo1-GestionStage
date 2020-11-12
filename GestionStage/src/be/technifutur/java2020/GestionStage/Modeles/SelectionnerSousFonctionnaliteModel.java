package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.AjouterActivite;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.ModifierActivite;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.RetirerActivite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireSelectionnerSousFonctionnalite;

import java.util.HashMap;

public class SelectionnerSousFonctionnaliteModel {

    HashMap<GestionnaireSelectionnerSousFonctionnalite, ActionStage> mapSelectionnerSousFonctionnalite = new HashMap<>();

    public SelectionnerSousFonctionnaliteModel() {

        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.AJOUTER, new AjouterActivite());
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.RETIRER, new RetirerActivite());
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.MODIFIER, new ModifierActivite());

    }

    public ActionStage getSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g) {

        return mapSelectionnerSousFonctionnalite.get(g);

    }

    public void addSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g, ActionStage a) {

        mapSelectionnerSousFonctionnalite.put(g, a);

    }

}
