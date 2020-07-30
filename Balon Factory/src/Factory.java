import java.awt.*;

class Factory extends Thread {
    ColorOfBalloon color;
    Storage store = new Storage();
    private static int time=0;

    public static int getTime() {
        return time;
    }
//        @Override
//    public void run() {
//        try {
//            Thread.sleep(20000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        store.addBalloon(produce());
//    }

    public Factory(ColorOfBalloon color) {
        this.color = color;
    }

    public Balloon produce(){
//        int temp=(int) (3000+Math.random() * (8000-3000));
//        time+=temp;
//        try {
//            Thread.sleep(temp);//it'll take a time approximately 8 minutes after then balloons are rising
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            Thread.sleep((int)(Math.random() * 100));//it's for faster way but should change the sleep time in Balloon class
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Balloon(color);
    }

}
