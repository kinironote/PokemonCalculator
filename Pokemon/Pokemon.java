
public class Pokemon{
    String name,type1,type2;
    Trick trick1,trick2,trick3,trick4;
    int attack,special,difence,hp;
    double charactor;
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
                special=Integer.parseInt(stream[4]);
                trick1 = (stream[5]!=null) ? new Trick(stream[5],DamageCalc.Tlist) : null;
                trick2 = (stream[6]!=null) ? new Trick(stream[6],DamageCalc.Tlist) : null;
                trick3 = (stream[7]!=null) ? new Trick(stream[7],DamageCalc.Tlist) : null;
                trick4 = (stream[8]!=null) ? new Trick(stream[8],DamageCalc.Tlist) : null;
                charactor=Double.parseDouble(stream[9]);
                find=true;
                System.out.println(list.str.get(i));
                break;
            } 
        }
    }
    public Pokemon(String name,PartyList list){
        for(int i=0;i<list.count;i++){
            stream = list.str.get(i).split(",");
            if(stream[0].equals(name)){
                this.name = name;
                type1 = stream[1];
                type2 = stream[2];
                hp = Integer.parseInt(stream[3]);
                difence = Integer.parseInt(stream[4]);
                special = Integer.parseInt(stream[5]);
                find=true;
                System.out.println(list.str.get(i));
                break;
            }
        }

    }
    public boolean isFind(){
        return find;
    }
    public void showStatus(int type){
        switch (type){
            case 0:
                System.out.println(name+","+type1+","+type2+","+attack+","+special+","+trick1+","+trick2+","+trick3+","+trick4+","+charactor);
                break;
            case 1:
                System.out.println(name+","+type1+","+type2+","+hp+","+difence+","+special);
                break;
        }
    }

}
