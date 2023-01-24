import javax.swing.*;
import java.awt.*;
public class Ball extends JPanel{
    private int x, y, size, xSpeed, ySpeed;

    public Ball(int inX, int inY, int inSize){
        x = inX;
        y = inY;
        size = inSize;
        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
    }

    public void Bounce(){
        if(x == 400 - size){
            int xAdd = xAdd*(-1);
        }
    }

    public void moveRight(){
        x = x + 3;
    }

    public void moveUp(){
        y = y - 1;
    }

    public void drawBall(Graphics g){
        g.fillOval(x, y, size, size);
    }

    public void changeSpeed(int newSpeed){
        xSpeed = newSpeed;
        ySpeed = newSpeed;
    }
}
