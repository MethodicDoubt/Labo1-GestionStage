package be.technifutur.java2020.GestionStage.Fonctionnalites;

import be.technifutur.java2020.GestionStage.Gestionnaires.GestionnaireSelectionnerSousFonctionnalite;
import be.technifutur.java2020.GestionStage.Menu.MenuSelectionnerSousFonctionnalite;
import be.technifutur.java2020.GestionStage.Modeles.SelectionnerSousFonctionnaliteModel;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.User.User;
import be.technifutur.java2020.GestionStage.Vues.VueMenuSelectionnerSousFonctionnalite;

import java.util.Scanner;

public class SelectionnerStage implements Runnable {

    private User user;

    private SelectionnerSousFonctionnaliteModel map;

    private VueMenuSelectionnerSousFonctionnalite vueMenuSelectionnerSousFonctionnalite = new VueMenuSelectionnerSousFonctionnalite();

    private MenuSelectionnerSousFonctionnalite menuSelectionnerSousFonctionnalite = new MenuSelectionnerSousFonctionnalite();

    private GestionnaireSelectionnerSousFonctionnalite sousFonctionnaliteChoisie;


    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        String entree;


        for (int i = 0; i < StageModel.getListStage().size(); i++) {

            System.out.println(StageModel.getListStage().get(i).toString());

        }

        System.out.println("Entre le nom du stage sur lequel vous voulez agir");

        entree = scanner.nextLine();

        this.user.setStageSelectionne(StageModel.getStageByName(entree));

        vueMenuSelectionnerSousFonctionnalite.afficherMenuSelectionnerSousFonctionnalite();

        entree = scanner.nextLine();

        while (!entree.equals("q")) {

            menuSelectionnerSousFonctionnalite.selectionSelectionnerSousFonctionnalite(entree);

            sousFonctionnaliteChoisie = menuSelectionnerSousFonctionnalite.getSousFonctionnaliteChoisie();

            Runnable sousFonctionnalite = map.getSelectionnerSousFonctionnalite(sousFonctionnaliteChoisie);

            if (sousFonctionnalite != null) {

                sousFonctionnalite.run();

                StageModel.Sauvegarde();

                vueMenuSelectionnerSousFonctionnalite.afficherMenuSelectionnerSousFonctionnalite();

            }

            entree = scanner.nextLine();

        }

    }

    public SelectionnerStage(User user) {

        this.user = user;

        this.map = new SelectionnerSousFonctionnaliteModel(user);

    }

}
