package AbstractionExercise;

public class MovablePoint implements Movable{
    private int x ;
    private int y ;

    private int xSpeed ;
    private int ySpeed ;

    public MovablePoint( int x , int y , int xSpeed, int ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y+=ySpeed;
        System.out.println("x :"+x+"  Y:" + y +"\nySpeed :" + ySpeed+"  xSpeed"+xSpeed);
    }

    public void moveDown() {
        y-=ySpeed;
        System.out.println("x :"+x+"  Y:" + y +"\nySpeed :" + ySpeed+"  xSpeed"+xSpeed);

    }

    public void moveLeft() {
        x-=xSpeed;
        System.out.println("x :"+x+"  Y:" + y +"\nySpeed :" + ySpeed+"  xSpeed"+xSpeed);

    }

    public void moveRight() {
        x+=xSpeed;
        System.out.println("x :"+x+"  Y:" + y +"\nySpeed :" + ySpeed+"  xSpeed"+xSpeed);

    }

}
