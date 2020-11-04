package be.technifutur.java2020.GestionStage;

import be.technifutur.java2020.GestionStage.Menu.MenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Menu.MenuRole;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireRole;

import java.util.Scanner;

public class Vue {

    GestionnaireRole roleChoisi;
    GestionnaireFonctionnalite FonctionnaliteChoisie;

    public void afficherMenuRole () {

        int choix;
        Scanner scanner = new Scanner(System.in);
        MenuRole menu = new MenuRole();


        System.out.println("Veuillez sélectionner un rôle en indiquant le numéro correspondant à :");
        System.out.println("- PARTICIPANT(1)");
        System.out.println("- INSCRIT(2)");
        System.out.println("- ORGANISATEUR(3)");
        System.out.println("- TRESORIER(4)");
        System.out.println("- SECRETARIAT(5)");

        choix = Integer.parseInt(scanner.nextLine());

        this.roleChoisi = menu.getRoleChoisi();

        afficherMenuFonctionnalite();

    }

    private void afficherMenuFonctionnalite(){

        int choix;
        Scanner scanner = new Scanner(System.in);
        MenuFonctionnalite menu = new MenuFonctionnalite();


        System.out.println("Veuillez sélectionner le numéro d'une action à effectuer :");
        System.out.println("- CREER UN STAGE(1)");
        System.out.println("- MODIFIER UN STAGE(2)");
        System.out.println("- SUPPRIMER UN STAGE(3)");
        System.out.println("- S'INSCRIRE A UN STAGE(4)");

        choix = Integer.parseInt(scanner.nextLine());

        this.FonctionnaliteChoisie = menu.getFonctionnaliteChoisie();

    }

}
