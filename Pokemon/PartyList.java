import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class PartyList{
    static int count=0;
    static String stream,type;
    static ArrayList<String> str = new ArrayList<String>();
    static String[] tmp;
    static String[] name = new String[10];
    public PartyList(){

        try{
            FileReader fr = new FileReader("party.txt");
            BufferedReader bf = new BufferedReader(fr);
            while((stream=bf.readLine())!=null) {
                str.add(stream);
                System.out.println(str.get(count));
                tmp = stream.split(",");
                name[count] = tmp[0];
                count++;
            }
                
        } catch (IOException e){
            e.printStackTrace();
        }       
    }
    public static String getName(int num){
        return name[num];
    }
}
