package be.technifutur.java2020.GestionStage.Utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DurationUtils {

    public static Duration transformDuration (String dureeRecue){

        Duration durationReturn = null;

        long transformDuree;

        try {

            transformDuree = Long.parseLong(dureeRecue);

            durationReturn = Duration.ofMinutes(transformDuree);

        }catch (Exception e){

            if (!dureeRecue.isEmpty()) {

                System.out.println("Votre date ne respecte pas le format demandé");

            }

        }

        return durationReturn;

    }

}
