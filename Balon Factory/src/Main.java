import java.awt.*;
import java.util.ArrayList;

class Main extends Frame {

    ArrayList <Balloon> list;
    public static void main(String[] args) {

        new Main();
    }

    Storage storage;

    public Main() {
        list=new ArrayList<>(99);
        this.setSize(900, 800);
        this.setVisible(true);

        storage = new Storage();
        Factory firstObject = new Factory(ColorOfBalloon.RED);
        Factory secondObject = new Factory(ColorOfBalloon.setRandomColor());
        Factory thirdObject = new Factory(ColorOfBalloon.setRandomColor());
        System.out.println("we have " + storage.listSize() + " ballon");

        while (!storage.isFull()) {
            storage.addBalloon(firstObject.produce());
            storage.count();
            storage.addBalloon(secondObject.produce());
            storage.count();
            storage.addBalloon(thirdObject.produce());
            storage.count();
            System.out.println("still process...");

        }
        while (storage.getList().size()!=0){
            addList(storage.reversedBalloons());
        }
        System.out.println("we have " + list.size() + " ballon");
        System.out.println("Balloons are loading...");
        System.out.println("Balloons are rising...");
        new Thread(() -> {

            while (true) {
                repaint();
                try {
                    Thread.sleep(1000/12);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public void addList(Balloon balloon){
        list.add(balloon);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i <list.size(); i++) {

            list.get(i).draw(g);

        }
    }
}

