import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MedicalLogReader {
    public static void displayMedicalLog(File medicalLogFile) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;
            System.out.println("Medical Log Contents:");
            System.out.println("---------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Medical log file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading medical log: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        File medicalLogFile = new File("medical_log.txt");
        displayMedicalLog(medicalLogFile);
    }
}
