
public class DamageCalc{
    public static void main(String args[]){
        PokemonList list = new PokemonList();
        Pokemon garchomp = new Pokemon("Garchomp",list);
        System.out.println(garchomp.isFind());
        double damage;
        damage=(22*100*187/110/50+2)*0.85;
        System.out.println(damage);
    }
}

