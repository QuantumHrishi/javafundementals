import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class ClickCounter{
    int count = 0;
    JLabel label;
    public ClickCounter(){
        JFrame f = new JFrame();
        JButton b = new JButton();
        label = new JLabel(); // new instances of components in gui
        b.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                count++;
                label.setText("count: " + count); // increase and display count after every click

               
            }
        });
        f.add(b, "North");
        f.add(label, "South");
        f.setSize(200, 100);//  location and size of components and windoow size
    }
    public static void main(String[] args) {
        new ClickCounter();
    
}
}
