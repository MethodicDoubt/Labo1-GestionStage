package be.technifutur.java2020.GestionStage.DB;

import be.technifutur.java2020.GestionStage.Modeles.StageModel;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import javax.swing.text.Position;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDonnees implements Serializable{

    private List<Stage> listeStage;

    //private List<Participant> listeParticipant = getListParticipant();

    private static final long serialVersionUID = 1L;

    File fichier = new File("Données_Sauvegardées");

    public void Sauvegarde (){

        // ouverture d'un flux sur un fichier
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))) {

            // sérialization de l'objet
            oos.writeObject(this);

            System.out.println(fichier.exists());

        } catch (
                FileNotFoundException e) {
            System.out.println("Fichier non trouvé");
        } catch (
                IOException e) {
            System.out.println("Erreur : 15646135465132168554");
            e.printStackTrace();
        }

    }

    public List<Stage> getListeStage() {

        if (listeStage == null) {

            listeStage = new ArrayList<>();

        }

        return listeStage;

    }
}
