
public class Trick{
    String type,name;
    int attack;
    private boolean find = false;
    String[] stream;
    public Trick(String name,TrickList list){
        for(int i=0;i<list.count;i++){
            stream = list.str.get(i).split(",");
            if (name.equals(stream[0])){
                this.name=stream[0];
                type=stream[1];
                attack=Integer.parseInt(stream[2]);
                find=true;
                System.out.println(list.str.get(i));
                break;
            } 
        }
    }
    public boolean isFind(){
        return find;
    }

}
