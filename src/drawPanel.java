import java.awt.*;
import javax.swing.*;
public class DrawPanel extends JPanel{
    public DrawPanel(){
        setBackground(Color.RED);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(100, 200, 50, 75);
    }
}