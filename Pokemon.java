
public class Pokemon{
    String name,type1,type2,trick1,trick2,trick3,trick4;
    int attack;
    private boolean find = false;
    String[] stream;
    public Pokemon(String name,PokemonList list){
        for(int i=0;i<list.count;i++){
            stream = list.str.get(i).split(",");
            if (name.equals(stream[0])){
                this.name=stream[0];
                type1=stream[1];
                type2=stream[2];
                attack=Integer.parseInt(stream[3]);
                trick1=stream[4];
                trick2=stream[5];
                trick3=stream[6];
                trick4=stream[7];
                find=true;
                System.out.println(list.str.get(i));
                break;
            } else {
                System.out.println(stream[0]+"   "+name);
            }
        }
    }
    public boolean isFind(){
        return find;
    }

}
