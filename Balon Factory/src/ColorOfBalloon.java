import java.util.Random;

enum ColorOfBalloon {
    GREY(142, 142, 147),
    RED(255, 0, 0,true),
    GREEN(76, 217, 100),
    PURPLE(88, 86, 214),
    LIGHTBLUE(52, 170, 220),
    BLUE(135, 206, 235),
    ORANGE(255, 165, 0),
    LIGHTPINK(255, 182, 193),
    DARKBLUE(0, 0, 139),
    DARKGREEN(0, 102, 51),
    SEAFOAM(51, 255, 153),
    BLACK(0, 0, 0),
    BLUEBERRY(19,11,41),
    VIOLET(153, 51, 255),
    DARKPINK(204, 0, 102),
    YELLOW(255, 255, 0);

    private int r;
    private int g;
    private int b;
    boolean isUsed=false;
    static int counter=1;

    ColorOfBalloon(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    private ColorOfBalloon(int r, int g, int b,boolean is) {
        this.isUsed=is;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
    public void setIsUsed(boolean used) {
        isUsed = used;
    }
    public static ColorOfBalloon setRandomColor() {

        int number = new Random().nextInt(ColorOfBalloon.values().length);
        if (!ColorOfBalloon.values()[number].isUsed){
            ColorOfBalloon.values()[number].setIsUsed(true);
            return ColorOfBalloon.values()[number];
        }
        else {
            return setRandomColor();
        }




//        ColorOfBalloon colorArr[]=ColorOfBalloon.values();
//        int color =(int)(Math.random() * (15)) ;
//        if(!colorArr[color].isUsed) {
//            colorArr[color].setIsUsed(true);
//            counter++;
//            return colorArr[color];
//        }
//        else{
//            return setRandomColor();
//        }
    }
}