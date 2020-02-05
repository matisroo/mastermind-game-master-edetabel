package kehtnakhkta18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String username = null; //Ajutine osa, kuni saaks mingid moodi ühendada teiste osadega
        String skoor = null;
        String time = null;
        String turns = null;

        try {
            FileReader reader = new FileReader("score.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); //Et näha mis on score.csv failis, ilma et peaks seda lahti teha
            }
            reader.close();

            // Üleval, BufferedReader, all BufferedWriter

            FileOutputStream outputStream = new FileOutputStream("score.csv", true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("--------------------");
            bufferedWriter.newLine();
            //bufferedWriter.write("Nimi: " + username);
            bufferedWriter.write("Nimi: " + "Mirgus"); //Ajutine
            bufferedWriter.newLine();
            //bufferedWriter.write("Käike: " + turns);
            bufferedWriter.write("Käike: " + "23"); //Ajutine
            bufferedWriter.newLine();
            //bufferedWriter.write("Aeg: " + time);
            bufferedWriter.write("Aeg: " + "00:02:20"); //Ajutine
            bufferedWriter.newLine();
            //bufferedWriter.write("Skoor: " + skoor);
            bufferedWriter.write("Skoor: " + "694201337"); //Ajutine
            bufferedWriter.newLine();
            bufferedWriter.write("---------------------");
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


















