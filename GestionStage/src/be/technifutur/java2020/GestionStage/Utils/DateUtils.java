package be.technifutur.java2020.GestionStage.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    //TRANSFORMATION DES STRING EN LOCALDATETIME

    public static LocalDateTime transformDate (String dateRecue){

        LocalDateTime dateReturn = null;

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

            dateReturn = LocalDateTime.parse(dateRecue, formatter);

        }catch (Exception e){

            if (!dateRecue.isEmpty()) {

                System.out.println("Votre date ne respecte pas le format demandé");

            }

        }

        return dateReturn;

    }

}
