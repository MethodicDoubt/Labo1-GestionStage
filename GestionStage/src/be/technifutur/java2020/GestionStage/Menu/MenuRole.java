package be.technifutur.java2020.GestionStage.Menu;

import be.technifutur.java2020.GestionStage.Role;

public class MenuRole {

    public Role roleChoisi;

    public  void choixRole (int choix){

        switch (choix){

            case 1 : this.roleChoisi = Role.PARTICIPANT;
            return;

            case 2 : this.roleChoisi = Role.INSCRIT;
            return;

            case 3 : this.roleChoisi = Role.ORGANISATEUR;
            return;

            case 4 : this.roleChoisi = Role.TRESORIER;
            return;

            case 5 : this.roleChoisi = Role.SECRETARIAT;
            return;

        }

    }

    public Role getRoleChoisi() {

        return roleChoisi;

    }
}
