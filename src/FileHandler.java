import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    ArrayList<String> covid19DataArray = new ArrayList<>();
    int linecounter = 1;

    public void loadData(){
        Covid19Data covid19Data = new Covid19Data();

        try {
            Scanner reader = new Scanner(new File("C:\\Users\\Hostile\\IdeaProjects\\CoronaFileHandler\\data\\11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                covid19Data.loadLineOfData(line);

                if (linecounter == 1){
                    linecounter++;
                } else {
                    covid19DataArray.add(line);
                    linecounter++;
                }
            }
            linecounter = 1;

        } catch (FileNotFoundException e) {
            System.out.println("file not found");

        } catch (IOException e) {
            System.out.println("wrong char set");
        }

    }
}
