package org.example;

import org.junit.jupiter.api.Test;

class PrintingImageTest {

    @Test
    void getImageFromNumber5() {
        PrintingImage image = new PrintingImage(5);
        String actualImageDisplay = image.display();
        String expectedResult = "   *\n" + "  ***\n" + " *****\n" + "*******\n" +  "   *\n" + "  ***\n";
        actualImageDisplay.compareTo(expectedResult);
    }
}