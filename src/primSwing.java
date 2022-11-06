import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class primSwing extends JFrame {
    
    primSwing(){
        this.setTitle("Prima Interfata");//titlu GUI
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// cand dai x se inchide prog
        this.setResizable(false);// nu se poate schimba dimensiunea
        this.setSize(400,400);// dimensiunea
        this.setVisible(true);// setam vizibilitatea

        ImageIcon image= new ImageIcon("logo.png");
        this.setIconImage(image.getImage());// logoul programului
        this.getContentPane().setBackground(new Color(150,40,225));//culoare backgroundului
    }
}
 