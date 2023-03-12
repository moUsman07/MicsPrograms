import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AppFrame extends BtnPanel implements ActionListener {

    JButton remove, add, exit;

    public JTextField txt;



    AppFrame() {
        GridLayout layout = new GridLayout(1,0);
        layout.setVgap(5);


       frame.add(pan);


        add = new JButton("add");
        add.setBounds(120,140,70,40);
        add.addActionListener(this);
        add(add);






        frame.setBounds(450,50,500,600);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);







    }


    public void actionPerformed(ActionEvent ae) {
         if (ae.getSource()==addTask){
            lable.setVisible(true);
        }
          if(ae.getSource()==dltTask){
             lable.setVisible(false);
         }

    }



    public static void main(String[] args){
        new AppFrame();

    }
}