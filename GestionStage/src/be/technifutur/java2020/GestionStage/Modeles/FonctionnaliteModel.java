package be.technifutur.java2020.GestionStage.Modeles;


import be.technifutur.java2020.GestionStage.Fonctionnalites.*;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;

import java.util.HashMap;

public class FonctionnaliteModel {

    HashMap<GestionnaireFonctionnalite, Runnable> mapFonctionnalite = new HashMap<>();

    public FonctionnaliteModel() {

        mapFonctionnalite.put(GestionnaireFonctionnalite.CREATION, new CreationStage ());
       // mapFonctionnalite.put(GestionnaireFonctionnalite.INSCRIPTION, new InscriptionStage());
        mapFonctionnalite.put(GestionnaireFonctionnalite.MODIFICATION, new ModificationStage());
        mapFonctionnalite.put(GestionnaireFonctionnalite.SUPPRESSION, new SuppressionStage());
        mapFonctionnalite.put(GestionnaireFonctionnalite.SELECTION, new SelectionnerStage());

    }

    public Runnable getFonctionnalite (GestionnaireFonctionnalite g){

        return mapFonctionnalite.get(g);

    }

    public void addFonctionnalite (GestionnaireFonctionnalite g, Runnable r){

        mapFonctionnalite.put(g, r);

    }

}
