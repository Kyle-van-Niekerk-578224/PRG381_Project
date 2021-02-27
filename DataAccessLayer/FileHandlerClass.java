package DataAccessLayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHandlerClass implements Operations {

    //this method provides functionality by calling it and providing a name of a txt file to be read
    //and returns it as a list datatype.
    @Override
    public List<String> readOperation(String filename) {
        List<String> text = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                text.add(line);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("An error occured");
        }
        return text;
    }

    //this method provides functionality by writing whatever object is provided to it into a new txt file
    @Override
    public void writeOperation(Object obj) {

        // this gets the date according to the system clock and the value is used to
        // name the text file
        Date dt = new Date();
        String name = DateFormat.getDateInstance().format(dt);
        ObjectOutputStream oos;

        try (FileOutputStream fos = new FileOutputStream(new File("Order_" + name + ".txt"));) {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj.toString());
            oos.close();
        } catch (IOException e) {
            System.out.println("an error occured");
        }

    }
}
