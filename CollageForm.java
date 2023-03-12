import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CollageForm implements ActionListener {
    public static void main(String[] args){
        new CollageForm();
    }
    JFrame frame;
    JPanel panel;
    JButton save, exit;
    JLabel name, rollNo, address, contact;
    JTextField nameField,rollNOField,contactField;
    JTextArea addressField;

    CollageForm(){
        createFrame();




    }
    public void createFrame(){
        frame = new JFrame("Collage Frame");
        frame.setBounds(40,20,550,460);
        panel = new JPanel();
        panel.setSize(550,410);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);


        frame.add(panel);
        createLabel();
        createTextField();
        createButtons();
        frame.setVisible(true);
    }

    public void createButtons(){
        save = new JButton("SAVE");
        save.setBounds(70,250,90,20);
        save.addActionListener(this::saveActionPerformed);
        panel.add(save);

        exit = new JButton("EXIT");
        exit.setBounds(190,250,90,20);
        exit.addActionListener(this::exitActionPerformed);
        panel.add(exit);
    }
    public void createLabel(){
        name = new JLabel("NAME ");
        name.setBounds(50,60,70,20);
        name.setForeground(Color.blue);
        panel.add(name);

        rollNo = new JLabel("ROLL NO. ");
        rollNo.setBounds(50,90,100,20);
        rollNo.setForeground(Color.blue);
        panel.add(rollNo);

        address = new JLabel("ADDRESS ");
        address.setBounds(50,150,100,20);
        address.setForeground(Color.blue);
        panel.add(address);

        contact = new JLabel("CONTACT ");
        contact.setBounds(50,120,100,20);
        contact.setForeground(Color.blue);
        panel.add(contact);
    }
    public void createTextField(){
        nameField = new JTextField(10);
        nameField.setBounds(160,60,100,20);
        panel.add(nameField);

        rollNOField= new JTextField(10);
        rollNOField.setBounds(160,90,40,20);
        panel.add(rollNOField);


        contactField = new JTextField(10);
        contactField.setBounds(160,120,100,20);
        panel.add(contactField);

        addressField= new JTextArea(0,13);
        addressField.setBounds(160,150,140,70);
        addressField.setVisible(true);
        addressField.setAlignmentY(Component.TOP_ALIGNMENT);
        addressField.setLineWrap(true);
        panel.add(addressField);

    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
    public  void saveActionPerformed(ActionEvent e){
        String formName = nameField.getText();
        try ( PrintWriter out = new PrintWriter("Collage Form "+formName+".html")) {
            out.print("Name:    ");
            out.println(nameField.getText());
            out.print("Roll NO:    ");
            out.println(rollNOField.getText());
            out.print("Contact:    ");
            out.println(contactField.getText());
            out.print("Address:    ");
            out.println(addressField.getText());

        }catch (FileNotFoundException e2){
            e2.printStackTrace();
        }
        if (e.getSource() == save){
            nameField.setText("");
            rollNOField.setText("");
            contactField.setText("");
            addressField.setText("");
        }
        System.out.println("Saved...");

        }
        public void exitActionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

}



