import javax.swing.*;
import java.awt.*;
public class Ball extends JPanel{
    private int x, y, size, xSpeed, ySpeed, rgb1, rgb2, rgb3;

    public Ball(int inX, int inY, int inSize, int rgb1, int rgb2, int rgb3){
        x = inX;
        y = inY;
        size = inSize;
        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
        rgb1 = (int)(Math.random()*256);
        rgb2 = (int)(Math.random()*256);
        rgb3 = (int)(Math.random()*256);
    }

public Ball(){
        x = (int)(Math.random()*500) + 1;
        y = (int)(Math.random()*500) + 1;
        size = (int)(Math.random()*20) + 10;
        xSpeed = (int)(Math.random()*20) + 1;
        ySpeed = (int)(Math.random()*20)+1;
        rgb1 = (int)(Math.random()*256);
        rgb2 = (int)(Math.random()*256);
        rgb3 = (int)(Math.random()*256);
}

    public void moveRight(){
        x = x + 3;
    }

    public void moveBall(JPanel panel){
        x+=xSpeed;
        y+=ySpeed;

        if(x>= panel.getWidth() - size || x<=0){
            xSpeed *= -1;
        }
        else if (y>=panel.getHeight() - size || y<=0){
            ySpeed *= -1;
        }
    }

    public void moveUp(){
        y = y - 1;
    }

    public void drawBall(Graphics g){

        g.fillOval(x, y, size, size);
        Color newColor = new Color(rgb1, rgb2, rgb3);
        g.setColor(newColor);
    }

    public void changeSpeed(int newSpeed){
        xSpeed = newSpeed;
        ySpeed = newSpeed;
    }
}
