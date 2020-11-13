package be.technifutur.java2020.GestionStage.Menu;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireRole;

public class MenuRole {

    public GestionnaireRole roleChoisi = null;

    public void choixRole (String choix){

        switch (choix){

            case "1" : this.roleChoisi = GestionnaireRole.PARTICIPANT;
            return;

            case "2" : this.roleChoisi = GestionnaireRole.INSCRIT;
            return;

            case "3" : this.roleChoisi = GestionnaireRole.ORGANISATEUR;
            return;

            case "4" : this.roleChoisi = GestionnaireRole.TRESORIER;
            return;

            case "5" : this.roleChoisi = GestionnaireRole.SECRETARIAT;
            return;

            case "6" : this.roleChoisi = GestionnaireRole.VISITEUR;
            return;

            default : this.roleChoisi = GestionnaireRole.VISITEUR;
        }

    }

    public GestionnaireRole getRoleChoisi() {

        return roleChoisi;

    }
}
