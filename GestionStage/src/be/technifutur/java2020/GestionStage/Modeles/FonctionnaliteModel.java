package be.technifutur.java2020.GestionStage.Modeles;


import be.technifutur.java2020.GestionStage.Fonctionnalites.*;
import be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites.InscriptionStage;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.User.User;

import java.util.HashMap;

public class FonctionnaliteModel {

    HashMap<GestionnaireFonctionnalite, Runnable> mapFonctionnalite = new HashMap<>();

    public FonctionnaliteModel(User user) {

        mapFonctionnalite.put(GestionnaireFonctionnalite.CREATION, new CreationStage (user));
        mapFonctionnalite.put(GestionnaireFonctionnalite.MODIFICATION, new ModificationStage(user));
        mapFonctionnalite.put(GestionnaireFonctionnalite.SUPPRESSION, new SuppressionStage(user));
        mapFonctionnalite.put(GestionnaireFonctionnalite.SELECTION, new SelectionnerStage(user));
        mapFonctionnalite.put(GestionnaireFonctionnalite.AFFICHAGE, new AfficherStage(user));

    }

    public Runnable getFonctionnalite (GestionnaireFonctionnalite g){

        return mapFonctionnalite.get(g);

    }

    public void addFonctionnalite (GestionnaireFonctionnalite g, Runnable r){

        mapFonctionnalite.put(g, r);

    }

}
