package lesson6;

import java.io.*;

public class Main {
    public static File file1 = new File("src/resources/text.txt");
    public static File file2 = new File("src/resources/text2.txt");
    public static File file3 = new File("src/resources/text3.txt");

    public static void main(String[] args) {

        makeOnetextfromTwo(new File[]{file1, file2}, file3);

    }

    public static void makeOnetextfromTwo(File[] names, File readyfile) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(readyfile);
            for (File name : names) {
                FileInputStream inputStream = new FileInputStream(name);
                int n;
                while ((n = inputStream.read()) != -1) {
                    fileOutputStream.write((char) n);

                }
                inputStream.close();
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
