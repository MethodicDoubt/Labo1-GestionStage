package be.technifutur.java2020.GestionStage;

import be.technifutur.java2020.GestionStage.Vues.VueMenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Vues.VueMenuRole;

public class Main {

    public static void main(String[] args) {

        VueMenuRole vueMenueRole = new VueMenuRole();
        VueMenuFonctionnalite vueMenuFonctionnalite = new VueMenuFonctionnalite();

        Controler controlerGeneral = new Controler();


        controlerGeneral.setVueMenuRole(vueMenueRole);
        controlerGeneral.setVueMenuFonctionnalite(vueMenuFonctionnalite);

        controlerGeneral.run();

    }

}
