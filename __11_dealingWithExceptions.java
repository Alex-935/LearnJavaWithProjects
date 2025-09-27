import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class __11_dealingWithExceptions {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("input.txt");
            int character;
            //when the end of the file is reached, read returns -1
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("This will always run");
        }

        try {
            FileWriter writer = new FileWriter("input.txt");
            String content = "212323";
            writer.write(content);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        //automatic resource cleanup
        //file closed automatically by try block
        try (FileReader newReader = new FileReader("input.txt")) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = newReader.read()) != -1) {
                content.append(character);
            }
            System.out.println(content.toString());
        } catch (Exception e) {


            //implementing auto closing statements
            /*
            implement AutoClosables and override close
             */
        }
    }
}

class SomeResources implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("Resource Closed");
    }
}