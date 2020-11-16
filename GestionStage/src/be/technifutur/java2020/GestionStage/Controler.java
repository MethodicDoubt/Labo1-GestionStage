package be.technifutur.java2020.GestionStage;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireRole;
import be.technifutur.java2020.GestionStage.Menu.MenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Menu.MenuRole;
import be.technifutur.java2020.GestionStage.Modeles.FonctionnaliteModel;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.User.User;
import be.technifutur.java2020.GestionStage.Vues.VueMenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Vues.VueMenuRole;

import java.util.Scanner;

public class Controler implements Runnable {

    VueMenuRole vueMenuRole;
    VueMenuFonctionnalite vueMenuFonctionnalite;

    GestionnaireRole roleChoisi;
    GestionnaireFonctionnalite fonctionnaliteChoisie;

    MenuRole roleUser = new MenuRole();
    FonctionnaliteModel map = new FonctionnaliteModel(new User());
    MenuFonctionnalite menuFonctionnalite = new MenuFonctionnalite();

    //--------------------------------------------------------------------- Setting des vues

    public void setVueMenuRole(VueMenuRole vue) {

        this.vueMenuRole = vue;

    }

    public void setVueMenuFonctionnalite(VueMenuFonctionnalite vue) {

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

        StageModel.load();

        switch (roleChoisi){

            case VISITEUR:

                vueMenuFonctionnalite.afficherMenuFonctionnalite(); //-------- AFFICHER LA VUE

                StageModel.load();

                String input = scanner.nextLine();

                while (!input.equals("q")) {

                    choix = input;

                    menuFonctionnalite.selectionFonctionnalite(choix);

                    this.fonctionnaliteChoisie = menuFonctionnalite.getFonctionnaliteChoisie();

                    Runnable fonctionnalite = map.getFonctionnalite(fonctionnaliteChoisie);

                    switch (fonctionnaliteChoisie){

                        case AFFICHAGE: fonctionnalite.run();
                        break;

                        case SELECTION: fonctionnalite.run();
                        break;

                        default:
                            System.out.println("Vous n'avez pas le niveau d'accès requis pour accéder à ces actions.");

                    }


                    vueMenuFonctionnalite.afficherMenuFonctionnalite();

                    input = scanner.nextLine();

                }
            break;

            case ORGANISATEUR:

                vueMenuFonctionnalite.afficherMenuFonctionnalite(); //-------- AFFICHER LA VUE

                input = scanner.nextLine();

                while (!input.equals("q")) {

                    choix = input;

                    menuFonctionnalite.selectionFonctionnalite(choix);

                    this.fonctionnaliteChoisie = menuFonctionnalite.getFonctionnaliteChoisie();

                    Runnable fonctionnalite = map.getFonctionnalite(fonctionnaliteChoisie);

                    if (fonctionnalite != null && fonctionnaliteChoisie != GestionnaireFonctionnalite.SELECTION) {

                        fonctionnalite.run();

                        StageModel.Sauvegarde();

                    }

                    if (fonctionnalite != null && fonctionnaliteChoisie == GestionnaireFonctionnalite.SELECTION) {

                        fonctionnalite.run();

                    }

                    vueMenuFonctionnalite.afficherMenuFonctionnalite();

                    input = scanner.nextLine();

                }
                break;

            case PARTICIPANT:

                vueMenuFonctionnalite.afficherMenuFonctionnalite(); //-------- AFFICHER LA VUE

                StageModel.load();

                input = scanner.nextLine();

                while (!input.equals("q")) {

                    choix = input;

                    menuFonctionnalite.selectionFonctionnalite(choix);

                    this.fonctionnaliteChoisie = menuFonctionnalite.getFonctionnaliteChoisie();

                    Runnable fonctionnalite = map.getFonctionnalite(fonctionnaliteChoisie);

                    switch (fonctionnaliteChoisie){

                        case AFFICHAGE: fonctionnalite.run();
                            break;

                        case SELECTION: fonctionnalite.run();
                            break;

                        default:
                            System.out.println("Vous n'avez pas le niveau d'accès requis pour accéder à ces actions.");

                    }

                    vueMenuFonctionnalite.afficherMenuFonctionnalite();

                    input = scanner.nextLine();

                }
            break;

            case TRESORIER: ;
            break;

            case SECRETARIAT: ;
            break;

            case INSCRIT: ;
            break;

        }

    }

}