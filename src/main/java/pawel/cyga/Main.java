package pawel.cyga;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String fileName = "unsorted.csv";

        //Define the number of rows and numbers per row
        int rows = 16;
        int numbersPerRow = 1000;

        try {
            //FileWriter object
            FileWriter writer = new FileWriter(fileName);

            //Random object for generating numbers
            Random random = new Random();

            //Loop through rows
            for (int i = 0; i < rows; i++) {
                //Loop through numbers in current row
                for (int j = 0; j < numbersPerRow; j++) {
                    //Generate random number between 0 and 1000000
                    int randomNumber = random.nextInt(1000000);
                    //Write number to the file
                    writer.write(randomNumber + ",");
                }
                //New line
                writer.write("\n");
            }

            writer.close();

            System.out.println("File " + fileName + " created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}