import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile{
    public static void main (String[] args) throws IOException{
        FileReader fr = new FileReader(""); //some file there
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}