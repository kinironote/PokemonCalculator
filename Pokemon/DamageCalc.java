
public class DamageCalc{
    static PokemonList Plist;
    static TrickList Tlist;
    static PartyList Party;
    static Pokemon[] temoti;
    public static void main(String args[]){
        Plist = new PokemonList();
        Tlist = new TrickList();
        Party = new PartyList();
        Pokemon garchomp = new Pokemon("ガブリアス",Plist);
        System.out.println(Tlist.count);
        double damage;
        temoti[0].showStatus(1);

        damage=(22*100*187/110/50+2)*0.85;
        System.out.println(damage);
    }

    private void inputParty(PartyList list){
        int i;
        for(i=0;i<list.count;i++){
            temoti[i] = new Pokemon(list.getName(i),Party);   
        }
    }
}

