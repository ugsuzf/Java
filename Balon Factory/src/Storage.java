import java.util.ArrayList;

class Storage {
    static int count=1;
    static boolean isFull=false;

    public static ArrayList<Balloon> bl=new ArrayList<>();
    static int listSize =bl.size();
    public void addBalloon(Balloon balloon){
        bl.add(balloon);
    }
    public boolean isFull(){
        if (bl.size()==99) {
            isFull = true;
            return true;
        }
        else
            return false;
    }
    public ArrayList<Balloon> getList(){
        return bl;
    }
    public int listSize(){
        return bl.size();
    }
    public void count(){
        System.out.println((count++)+"th balloon produced.");
    }
    public static Balloon reversedBalloons(){
        return bl.remove(bl.size()-1);
    }
}
