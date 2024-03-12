package components;

import java.io.InputStream;
import java.util.*;

/*
 * class that generates text for the user to type out
 */
public class TextGenerator {

    /**
     * method to take engmix.txt (plaintext list of english dictionary) and
     * convert it into a string
     * 
     * loads enigma.txt from classpath then scans through it and converts to
     * a string
     */
    public static String grabRawText() throws Exception {
        
        ClassLoader classloader = 
            Thread.currentThread().getContextClassLoader();
        InputStream is = 
            classloader.getResourceAsStream("engmix.txt");

        Scanner s = new Scanner(is).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        s.close();

        return result;
    }

    /**
     * returns a list of 30 words when given an input of type plaintext words
     * seperated with new lines
     */
    public static List<String> generateList(
        String inputString
    ) throws Exception {

        List<String> rawList = Arrays.asList(inputString.split("\\s+"));
        List<String> refinedList = new ArrayList<String>();
        Random randomiser = new Random();
        for(int i = 0; i < 30; i++) {
            String myString = rawList.get(randomiser.nextInt(rawList.size()));
            refinedList.add(myString);
        }

        return refinedList;

    }

}