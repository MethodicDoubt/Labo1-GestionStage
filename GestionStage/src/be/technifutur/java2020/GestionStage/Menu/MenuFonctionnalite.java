package be.technifutur.java2020.GestionStage.Menu;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;

public class MenuFonctionnalite {

    public GestionnaireFonctionnalite gestionnaireFonctionnalite;

    public void selectionFonctionnalite (int choix) {

        switch (choix){

            case 1 : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.CREATION;
                return;

            case 2 : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.MODIFICATION;
                return;

            case 3 : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.SUPPRESSION;
                return;

            case 4 : this.gestionnaireFonctionnalite = GestionnaireFonctionnalite.INSCRIPTION;
                return;

        }

    }

    public GestionnaireFonctionnalite getFonctionnaliteChoisie() {

        return gestionnaireFonctionnalite;

    }
}
