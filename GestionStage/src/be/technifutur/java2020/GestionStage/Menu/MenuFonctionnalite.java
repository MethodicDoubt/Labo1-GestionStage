package be.technifutur.java2020.GestionStage.Menu;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;

public class MenuFonctionnalite {

    private GestionnaireFonctionnalite gestionnaireFonctionnalite;

    public void selectionFonctionnalite (String choix) {

        switch (choix){

            case "1" : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.CREATION;
                return;

            case "2" : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.MODIFICATION;
                return;

            case "3" : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.SUPPRESSION;
                return;

            case "4" : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.SELECTION;
                return;

            case "5" : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.AFFICHAGE;
                return;

            default : gestionnaireFonctionnalite = null;
        }

    }

    public GestionnaireFonctionnalite getFonctionnaliteChoisie() {

        return gestionnaireFonctionnalite;

    }
}
