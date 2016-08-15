import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class PokemonList{
    static int attack,count=0;
    static String stream,type;
    static ArrayList<String> str = new ArrayList<String>();
    public PokemonList(){

        try{
            FileReader fr = new FileReader("pokemonList.txt");
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
