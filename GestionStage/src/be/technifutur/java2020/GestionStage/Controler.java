package be.technifutur.java2020.GestionStage;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireRole;
import be.technifutur.java2020.GestionStage.Menu.MenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Menu.MenuRole;
import be.technifutur.java2020.GestionStage.Modeles.FonctionnaliteModel;
import be.technifutur.java2020.GestionStage.Vues.VueMenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Vues.VueMenuRole;

import java.util.Scanner;

public class Controler implements Runnable {

    VueMenuRole vueMenuRole;
    VueMenuFonctionnalite vueMenuFonctionnalite;

    GestionnaireRole roleChoisi;
    GestionnaireFonctionnalite fonctionnaliteChoisie;

    MenuRole roleUser = new MenuRole();
    FonctionnaliteModel map = new FonctionnaliteModel();
    MenuFonctionnalite menuFonctionnalite = new MenuFonctionnalite();

    //--------------------------------------------------------------------- Setting des vues

    public void setVueMenuRole (VueMenuRole vue){

         this.vueMenuRole = vue;

    }

    public void setVueMenuFonctionnalite(VueMenuFonctionnalite vue){

        this.vueMenuFonctionnalite = vue;

    }

    public void run() {

        String choix;
        Scanner scanner = new Scanner(System.in);



        vueMenuRole.afficherMenuRole(); //---------------------------- AFFICHER LA VUE



        choix = scanner.nextLine();

        roleUser.choixRole(choix);

        this.roleChoisi = roleUser.getRoleChoisi();

        choix = "";

        //---------------------------------------



        vueMenuFonctionnalite.afficherMenuFonctionnalite(); //-------- AFFICHER LA VUE



        String input = scanner.nextLine();

        while (!input.equals("q")) {

            choix = input;

            menuFonctionnalite.selectionFonctionnalite(choix);

            this.fonctionnaliteChoisie = menuFonctionnalite.getFonctionnaliteChoisie();

            Runnable fonctionnalite = map.getFonctionnalite(fonctionnaliteChoisie);

            if (fonctionnalite != null){

                fonctionnalite.run();

            }

            vueMenuFonctionnalite.afficherMenuFonctionnalite();

            input = scanner.nextLine();

        }

    }

}