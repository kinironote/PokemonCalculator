import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class TrickList{
    static int count=0;
    static String stream;
    static ArrayList<String> str = new ArrayList<String>();
    public TrickList(){
        try{
            FileReader fr = new FileReader("tricks.txt");
            BufferedReader bf = new BufferedReader(fr);
            while((stream=bf.readLine())!=null) {
                str.add(stream);
                count++;
            }
                
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
