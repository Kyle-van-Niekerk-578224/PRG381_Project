package DataAccessLayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerClass implements Operations {

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

    @Override
    public void writeOperation(Object obj) {

        ObjectOutputStream oos;

        try (FileOutputStream fos = new FileOutputStream(new File("Order.txt"))) {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj.toString());
            oos.close();
        } catch (IOException e) {
            System.out.println("an error occured");
        }

    }
}
