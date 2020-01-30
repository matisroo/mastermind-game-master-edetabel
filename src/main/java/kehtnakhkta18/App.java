package kehtnakhkta18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new File("score.csv"))) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username");

            String userName = myObj.nextLine();
            String turns = null;

            Instant start = Instant.now();
            //Timeunit.seconds.sleep(5);
            Instant end = Instant.now();
            Duration interval = Duration.between(start, end);


            //midagi midagi, nupu vajutamine
            //midagi midagi, nupu vajutamine
            //midagi midagi, nupu vajutamine
            //midagi midagi, nupu vajutamine


            StringBuilder sb = new StringBuilder();
            sb.append("Name: " + userName);
            sb.append(',');
            sb.append("Turns: " + turns);
            sb.append(',');
            sb.append("Time: " + interval.getSeconds());
            sb.append('\n');

            writer.write(sb.toString());





        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
















