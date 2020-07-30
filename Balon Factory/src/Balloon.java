import java.awt.*;

class Balloon extends Thread{

    int x;
    int y;
    int width=70;
    int height=80;
    int yy=2;
    ColorOfBalloon color;
    public Balloon(ColorOfBalloon color) {

        this.x=(int) (Math.random()*750)+80;
        this.y=900;
        this.color=color;

        new Thread(()->{
            try {
                Thread.sleep(10000);//if factory's produce methods change,you should change those numbers
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            start();
//            synchronized (this){
//                while (Storage.listSize!=0){
//                    try {
//                        wait();
//
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            synchronized (this){
//                notify();
//            }
//            start();
        }).start();

    }

    public void draw(Graphics g){
        Color color=new Color(this.color.getR(),this.color.getG(),this.color.getB());
        g.setColor(color);
        g.fillOval(x,y,width,height);
        g.setColor(Color.black);
        g.drawLine(x+(width/2),y+height,x+(width/2),y+ height+100);

    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            y -= 2;
            if (this.color==ColorOfBalloon.RED){
                if (y==200)
                    y=-300;
            }
            else{
                if (y==400)
                    y=-300;
            }
            try {
                sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
