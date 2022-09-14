/**
 * Tools to help solve the task.
 */

package se.kth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Utilities {
    private Utilities() {}

    /**
     * Be able to read a text information from a txt file.
     * @param file the file name that want to be read.
     * @return the string containing the text.
     */
    static String readText(String file) {
        Path textPath = Paths.get(file);
        try {
            String text = Files.readString(textPath);
            return text;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }

    /**
     * Save the text to a txt file.
     * @param text the text that wanted to be saved.
     * @param file the file name in which that text will be save into.
     */
    static void saveText(String text, String file) {
        try{
            FileWriter fileWriter = new FileWriter(new File(file));
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Filter the text passed and remove all the the non-alphabetical characters and replace them with blank space.
     * @param text the text that wanted to be cleaned.
     * @return the new filtered text.
     */
    static String filterText(String text) {      
        StringBuilder filteredText = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            if(((int)text.charAt(i) > 64 && (int)text.charAt(i) < 91) // A-Z
                    || ((int)text.charAt(i) > 96 && (int)text.charAt(i) < 123) // a-z
                    || text.charAt(i) == '\n'
                    || text.charAt(i) ==  'é') {
                filteredText.append(text.charAt(i));
            } else {
                filteredText.append(" ");
                if ((int)text.charAt(i) == 8220|| (int)text.charAt(i) == 8221) {
                    filteredText.append("  ");
                }
            }
        }
        return filteredText.toString();
    }
}
