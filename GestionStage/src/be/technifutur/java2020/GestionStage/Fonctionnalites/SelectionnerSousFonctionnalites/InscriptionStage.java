package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Modeles.Participation;
import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Personne;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.User.User;

import java.util.Scanner;

public class InscriptionStage implements Runnable {

    private User user;

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        String entree;


        //----------------------------------------------------------------------------------AFFICHAGE DES STAGES

        for (Stage s : StageModel.getListStage()) {

            System.out.println(s.toString());

        }

        //---------------------------------------------------------------------------------- SELECTION DU STAGE

        System.out.println("Entre le nom du stage auquel vous voulez vous inscrire");

        entree = scanner.nextLine();

        //---------------------------------------------------------------------------------- CREATION D'UNE PERSONNE

        Personne inscrit = new Personne();

        System.out.println("Entrez votre nom");

        entree = scanner.nextLine();

        inscrit.setNom(entree);

        System.out.println("Entrez votre prénom");

        entree = scanner.nextLine();

        inscrit.setPrenom(entree);

        System.out.println("Entrez votre âge");

        entree = scanner.nextLine();

        inscrit.setAge(Integer.parseInt(entree));

        user.setPersonneSelectionne(inscrit);

        //-------------------------------------------------------------- CREATION ET AJOUT D'UNE PARTICIPATION AU STAGE

        user.getStageSelectionne().inscriptionStage(inscrit);

    }

    public InscriptionStage(User user) {

        this.user = user;

    }
}
