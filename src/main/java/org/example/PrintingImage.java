package org.example;

public class PrintingImage {

    private int number;

    public PrintingImage(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String display() {
        String image = "";
        for(int i = 1; i < number; i++){
            image = image + getLine(number, i);
        }
        for(int m = 1; m <= 2; m++){
            image = image + getLine(number, m);
        }
        return image;
    }
    private static String getLine(int number, int i) {
        String line = "";
        for(int j = number; j > i; j--) {
            line = line + " ";
        }
        for(int k = 1; k <= (i * 2)-1; k++){
            line = line + "*";
        }
        line = line + "\n";

        return line;
    }


}
