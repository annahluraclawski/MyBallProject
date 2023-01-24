import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
      System.out.println("Making an online replit");
        JFrame newFrame = new JFrame();
        newFrame.setSize(500, 500);
        DrawPanel newPanel = new DrawPanel();
        BallPanel newPanel2 = new BallPanel();

        newFrame.add(newPanel2);

        //newFrame.add(newPanel);
        newFrame.setVisible(true);
    }
}