package variant16;

import java.io.*;

public class Task {
    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String text = br.readLine();
        int count = 0;

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                count++;
            }
        }

        System.out.println("a harfi " + count + " marta qatnashgan ");
    }
}
