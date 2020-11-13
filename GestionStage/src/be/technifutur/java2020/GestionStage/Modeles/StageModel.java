package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.DB.BaseDeDonnees;
import be.technifutur.java2020.GestionStage.Primitives.Stage;

import javax.swing.text.Position;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class StageModel {

    private static BaseDeDonnees db = new BaseDeDonnees();

    public static List<Stage> getListStage (){

        return Collections.unmodifiableList(db.getListeStage());

    }

    public static boolean add(Stage stage){

        return db.getListeStage().add(stage);

    }


    public static Stage getStageByName(String nom){

        Stage stage = null;

        List<Stage> stageList = db.getListeStage();

        for (int i = 0; i < stageList.size() && stage == null; i++){

            if (stageList.get(i).getNom().equals(nom)){

                stage = stageList.get(i);

            }

        }

        return stage;

    }

    public static boolean remove(Stage stage){

        return db.getListeStage().remove(stage);

    }

    public static void load() {

        File fichier = new File("Données_Sauvegardées");

        // ouverture d'un flux sur un fichier
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {

            // désérialization de l'objet
            StageModel.db = (BaseDeDonnees) ois.readObject();

            System.out.println("Le fichier a été chargé");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void Sauvegarde(){

        db.Sauvegarde();

        System.out.println("Le fichier a été sauvegardé");

    }

}
