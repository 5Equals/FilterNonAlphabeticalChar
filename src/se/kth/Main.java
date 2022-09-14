/**
 * The task is to clean(filter) a specific text from all the non-alphabetical characters and replace them with
 * blank space.
 */

package se.kth;

public class Main {
    public static void main(String[] args) {
        // Preparations
        String textFile = "theText.txt";
        String filteredTextFile = "theFilteredText.txt";

        // Test
        Test.filterTextTest(textFile, filteredTextFile);
    }
}

class Test {
    private Test() {}

    static void filterTextTest(String textFile, String filteredTextFile) {
        String theText = "";
        theText = Utilities.readText(textFile);
        String filterText = Utilities.filterText(theText);
        Utilities.saveText(filterText,filteredTextFile);
        System.out.println("Done!");
    }
}
