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

            bufferedWriter.write("------------------------");
            bufferedWriter.newLine();
            if (username != null) {
                bufferedWriter.write("Nimi: " + username);
            } else {
                bufferedWriter.write("Kasutajanimi pole leitud!");
        }
            bufferedWriter.newLine();
            if (turns != null) {
                bufferedWriter.write("Käike: " + turns);
            } else {
                bufferedWriter.write("Miski läks käikude lugemisel valesti!");
            }
            bufferedWriter.newLine();
            if (time != null) {
                bufferedWriter.write("Aeg: " + time);
            } else {
                bufferedWriter.write("Miski läks aja lugemisel valesti!");
            }
            bufferedWriter.newLine();
            if (skoor != null) {
                bufferedWriter.write("Skoor: " + skoor);
            } else {
                bufferedWriter.write("Miski läks skoori lugemisel valesti!");
            }
            bufferedWriter.newLine();
            bufferedWriter.write("------------------------");
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


















