package be.technifutur.java2020.GestionStage;

import be.technifutur.java2020.GestionStage.Fonctionnalites.CreationStage;
import be.technifutur.java2020.GestionStage.Fonctionnalites.InscriptionStage;
import be.technifutur.java2020.GestionStage.Fonctionnalites.ModificationStage;
import be.technifutur.java2020.GestionStage.Fonctionnalites.RecupererStage;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireStage;
import be.technifutur.java2020.GestionStage.Menu.MenuFonctionnalite;
import be.technifutur.java2020.GestionStage.Menu.MenuRole;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireFonctionnalite;
import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireRole;
import be.technifutur.java2020.GestionStage.Modeles.FonctionnaliteModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Vue {

    GestionnaireRole roleChoisi;
    GestionnaireFonctionnalite fonctionnaliteChoisie;
    MenuRole roleUser = new MenuRole();
    FonctionnaliteModel map = new FonctionnaliteModel();

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

        roleUser.choixRole(choix);

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

        String input = scanner.next();

        if (!input.equals("q")) {

            choix = Integer.parseUnsignedInt(input);

            menu.selectionFonctionnalite(choix);

            this.fonctionnaliteChoisie = menu.getFonctionnaliteChoisie();

            afficherFonctionnalite(fonctionnaliteChoisie);

        }

    }

    private void afficherFonctionnalite (GestionnaireFonctionnalite fonctionnaliteChoisie){

        Scanner scanner = new Scanner(System.in);

        String nom;
        String dateDebut;
        String dateFin;
        int choix;

        map.getFonctionnalite(fonctionnaliteChoisie).run();

                Iterator<Stage> iterator = GestionnaireStage.getStageList().iterator();

                while (iterator.hasNext()){

                    int i = 0;

                    System.out.print(iterator.next() + " // Stage numéro " + i + "\n");

                    i++;

                }

                break;

            case INSCRIPTION:
                // InscriptionStage.ajoutInscription();
                break;

            case MODIFICATION:

                while (GestionnaireStage.getStageList().iterator().hasNext()){

                    int i = 0;

                    System.out.print(GestionnaireStage.getStageList().indexOf(i) + " (" + i + ") " + " / ");

                    i++;

                }

                System.out.println("- CHOISIR UN STAGE A MODIFIER");
                choix = Integer.parseInt(scanner.nextLine());

                System.out.println("- MODIFIER LE NOM DU STAGE");
                nom = scanner.nextLine();

                System.out.println("- MODIFIER LA DATE DE DEBUT DU STAGE");
                dateDebut = scanner.nextLine();

                System.out.println("- MODIFIER LA DATE DE FIN DU STAGE");
                dateFin = scanner.nextLine();

                ModificationStage.run(GestionnaireStage.getStageList(), choix, nom, dateDebut, dateFin);

                iterator = GestionnaireStage.getStageList().iterator();

                int i = 0;

                while (iterator.hasNext()){

                    System.out.print(iterator.next() + " (" + i + ") " + " / ");

                    i++;

                }

                break;

        }

        afficherMenuFonctionnalite();

    }

}
