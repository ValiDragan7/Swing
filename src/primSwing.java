import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;


public class primSwing extends JFrame {
    
    primSwing(){
        //imagini folosite
        ImageIcon image= new ImageIcon("logo.png");
        ImageIcon image2= new ImageIcon("luffy.gif");
        Border border = BorderFactory.createLineBorder(Color.orange,3);//doar o granita

        //label
        JLabel label = new JLabel("Haida la Master Chef");//poate fi separat cu label.text("cv aci")
        label.setIcon(image2);//setam imaginea labelului
        label.setHorizontalTextPosition(JLabel.CENTER);//CENTER,LEFT,RIGHT IN RELATIE CU IMAGINEA
        label.setVerticalTextPosition(JLabel.TOP);//TOP,CENTER,BOTTOM IN RELATIE CU IMAGINEA
        label.setForeground(Color.ORANGE);//culoare textului
        label.setFont(new Font("Calibri",Font.BOLD,30));//setarea fontului(model,tip,marime)
        label.setIconTextGap(100);//seteaza distanta dintre imagine si text
        label.setBackground(Color.black);//culoare de background al label-ului
        label.setOpaque(true);// opacitate???
        label.setBorder(border);//face vizibil un border
        label.setVerticalAlignment(JLabel.CENTER);// pozitia verticala a label-ului
        label.setHorizontalAlignment(JLabel.CENTER);//pozitia orizontala a label-ului
        //label.setBounds(100,120,400,300);// setam pozitia si marimea

        //Frame(main thing) setari
        this.setTitle("Prima Interfata");//titlu GUI
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// cand dai x se inchide prog
        this.setResizable(false);// nu se poate schimba dimensiunea
        this.setSize(600,600);// dimensiunea
        //this.setLayout(null);//din cauza layout manager-ului implicit, layout ocupa tot ecranul, asa ca il setam pe null si dupa ii dam valori(linia 28)
        this.setVisible(true);// setam vizibilitatea
        this.add(label);
        this.setIconImage(image.getImage());// logoul programului
        this.getContentPane().setBackground(new Color(150,40,225));//culoare backgroundului
        //this.pack();// frame-ul isi schimba dimensiunea in cea mai mica posibila(se muleaza pe marimea label-ului in cazul nostru) mereu la final
    }
}
 