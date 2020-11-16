package be.technifutur.java2020.GestionStage.Fonctionnalites.SelectionnerSousFonctionnalites;

import be.technifutur.java2020.GestionStage.Primitives.Activite;
import be.technifutur.java2020.GestionStage.Primitives.Personne;
import be.technifutur.java2020.GestionStage.Primitives.Stage;
import be.technifutur.java2020.GestionStage.User.User;

import java.util.Scanner;

public class InscriptionActivite implements Runnable {

    private User user;

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        String entree;

        if (!user.getStageSelectionne().getMapActivite().isEmpty()) {

            System.out.println("<Voici la liste des activités du stage sélectionné>");

            for (Activite a : user.getStageSelectionne().getMapActivite().values()) {

                System.out.println(a.afficherActivite());

            }

            //------------------------------------------------------------------------------ INSCRIPTIONS AUX ACTIVITES

            System.out.println("Entrez le nom des activités auxquelles vous voulez vous inscrire");

            entree = scanner.nextLine();

            user.setActiviteSelectionne(user.getStageSelectionne().getActiviteByName(entree));

            //---------------------------------------------------------------------------------- CREATION D'UNE PERSONNE

            if (user.getPersonneSelectionne() == null) {

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

            }

            //-----------------------------------------------------------------------------------------------

            user.getStageSelectionne().addActiviteToPersonne(user.getPersonneSelectionne(), user.getActiviteSelectionne());

        } else {

            System.out.println("Il n'y a pas d'activités prévues pour ce stage");

        }

    }

    public InscriptionActivite(User user) {

        this.user = user;

    }
}
