
public class Trick{
    String type,name,category;
    int attack,accuracy;
    private boolean find = false;
    String[] stream;
    public Trick(String name,TrickList list){
        for(int i=0;i<list.count;i++){
            stream = list.str.get(i).split(",");
            if (name.equals(stream[0])){
                this.name=stream[0];
                type=stream[1];
                category=stream[2];
                accuracy=Integer.parseInt(stream[3]);
                attack=Integer.parseInt(stream[4]);
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
