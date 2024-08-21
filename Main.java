import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("What should I call you?");

        String name = CaptureInput();

        VerifyInput(name);

        System.out.println("What is your title?");

        String title = CaptureInput();

        VerifyInput(title);

        NameTag nameTag = new NameTag(name, title);

        NameTag copyTag = new NameTag(nameTag);

        System.out.println("Nice to meet you! I made a name Tag for you:\n" + copyTag.toString());
    }

    public static void VerifyInput(String name)
    {
        // check to be sure the name is valid!
        if (name == null)
        {
            name = "No Name Entered.";
        }
    }

    public static String CaptureInput()
    {
        String name = null;

                // enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
       try
       {
         name = reader.readLine();
       }
       catch (IOException e)
       {
        System.out.println(e);
       }
        

        return name;
    }
}