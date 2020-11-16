package be.technifutur.java2020.GestionStage.Menu;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireSelectionnerSousFonctionnalite;

public class MenuSelectionnerSousFonctionnalite {

    private GestionnaireSelectionnerSousFonctionnalite gestionnaireSelectionnerSousFonctionnalite;

    public void selectionSelectionnerSousFonctionnalite(String choix) {

        switch (choix) {

            case "1":
                this.gestionnaireSelectionnerSousFonctionnalite = GestionnaireSelectionnerSousFonctionnalite.AJOUTER;
                return;

            case "2":
                this.gestionnaireSelectionnerSousFonctionnalite = GestionnaireSelectionnerSousFonctionnalite.MODIFIER;
                return;

            case "3":
                this.gestionnaireSelectionnerSousFonctionnalite = GestionnaireSelectionnerSousFonctionnalite.RETIRER;
                return;

            case "4":
                this.gestionnaireSelectionnerSousFonctionnalite = GestionnaireSelectionnerSousFonctionnalite.INSCRIPTIONSTAGE;
                return;

            case "5":
                this.gestionnaireSelectionnerSousFonctionnalite = GestionnaireSelectionnerSousFonctionnalite.INSCRIPTIONACTIVITE;
                return;

            default:
                gestionnaireSelectionnerSousFonctionnalite = null;
        }

    }

    public GestionnaireSelectionnerSousFonctionnalite getSousFonctionnaliteChoisie() {

        return gestionnaireSelectionnerSousFonctionnalite;


    }

}
