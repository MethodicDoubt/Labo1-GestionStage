package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.*;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireSelectionnerSousFonctionnalite;
import be.technifutur.java2020.GestionStage.User.User;

import java.util.HashMap;

public class SelectionnerSousFonctionnaliteModel {

    HashMap<GestionnaireSelectionnerSousFonctionnalite, Runnable> mapSelectionnerSousFonctionnalite = new HashMap<>();

    public SelectionnerSousFonctionnaliteModel(User user) {

        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.AJOUTER, new AjouterActivite(user));
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.RETIRER, new RetirerActivite(user));
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.MODIFIER, new ModifierActivite(user));
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.INSCRIPTIONSTAGE, new InscriptionStage(user));
        mapSelectionnerSousFonctionnalite.put(GestionnaireSelectionnerSousFonctionnalite.INSCRIPTIONACTIVITE, new InscriptionActivite(user));

    }

    public Runnable getSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g) {

        return mapSelectionnerSousFonctionnalite.get(g);

    }

    public void addSelectionnerSousFonctionnalite(GestionnaireSelectionnerSousFonctionnalite g, Runnable a) {

        mapSelectionnerSousFonctionnalite.put(g, a);

    }

}
