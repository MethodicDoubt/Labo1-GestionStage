package be.technifutur.java2020.GestionStage.Modeles;

import be.technifutur.java2020.GestionStage.Primitives.Stage;

import java.time.LocalDateTime;

public abstract class StageModel {

    private String nom;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    public abstract void modifierStage(String nom, String dateDebut, String dateFin);

}
