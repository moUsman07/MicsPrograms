import javax.swing.*;
import java.awt.*;


public class Todo extends JFrame {
    JButton save,abc;

    JTextField tfield;
    GridLayout layout;
    Todo(){
        GridLayout layout =new GridLayout(5,1);
        layout.setHgap(5);
        layout.setVgap(5);


        JPanel p = new JPanel();
        p.setBackground(Color.red);
        p.setBounds(0, 150, 500, 250);
        p.setLayout(layout);
        add(p);



        JLabel textLable = new JLabel("To Do List");
        textLable.setBounds(195,0,100,50);
        textLable.setFont(new Font("Brakes",Font.BOLD,18));
        add(textLable);


        tfield = new JTextField("to do list");
        tfield.setBounds(60,40,360,40);
        tfield.setFont(new Font("Brakes",Font.BOLD,18));
        add(tfield);

        save = new JButton("Add");
        save.setBounds(200,90,70,20);
        add(save);
/*
        abc = new JButton("abc");
        abc.setBounds(200,90,70,20);
        p.add(abc);
*/




        setBounds(450,50,500,600);
        setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public JButton getsave(){
        return save;
    }
    public static void main(String[] args){
        new Todo();
        //new example();

    }
}

