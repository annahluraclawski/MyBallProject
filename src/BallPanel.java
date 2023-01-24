import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BallPanel extends JPanel{
    int x = 100;
    int y = 100;
    int xSpeed = 3;
    int ySpeed = 3;

    Ball[] balls = new Ball();
    Ball[] myBall = new Ball[];
    public BallPanel(){
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int keyCode = e.getKeyCode();
                if(keyCode == 68){
                   myBall.moveRight();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x, y, 20, 20);
        x+=xSpeed;
        y+=ySpeed;
        if(x >= getWidth()-20 || x <= 0){
            xSpeed *= -1;
        }
        if(y >= getHeight()-20 || y <= 0){
            ySpeed *= -1;
        }
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }
}