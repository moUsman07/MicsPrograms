import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnPanel extends JPanel {
    public JPanel btnPanel,mainPanel;
    JTextField txt,txt1;
    public JButton addTask, dltTask, task;
    JFrame frame;
    public JLabel  lable;
    public JPanel p,pan;

    BtnPanel() {
        GridLayout lay = new GridLayout(2, 1);
        lay.setHgap(5);

        addTask = (new JButton("ADD TASK"));
        addTask.setBounds(30, 510, 100, 20);
        addTask.setBackground(new Color(212332156));
        addTask.addActionListener((ActionListener) this);


        dltTask = (new JButton("DLT TASK"));
        dltTask.setBounds(350, 510, 100, 20);
        dltTask.addActionListener((ActionListener) this);
        dltTask.setBackground(new Color(212332156));


        task = (new JButton("TASK"));
        task.setBounds(200, 510, 100, 20);
        task.setBackground(new Color(212332156));


        lable = new JLabel("ali");
        lable.setBounds(270,140,70,40);
        lable.setFont(new Font("Tohama",Font.BOLD,25));

       pan= new JPanel();
        pan.setBackground(new Color(1345690));
        pan.setBounds(0,150,500,150);
        pan.setLayout(null);
        add(pan);

        btnPanel = new JPanel();
        btnPanel.setBackground(new Color(139220));
        btnPanel.setBounds(0, 490, 500, 70);
        //btnPanel.setLayout(lay);
        //add(btnPanel);

        txt1 = new JTextField("txt11111111");
        txt1.setBounds(190,30,90,30);



        txt =new JTextField("txt");
        txt.setBounds(10,30,140,59);

        frame = new JFrame();
        frame.add(lable);
        frame.add(txt1);
        frame.add(txt);
        frame.add(pan);
        frame.add(dltTask);
        frame.add(addTask);
        frame.add(btnPanel);
        //frame.add(mainPanel);





    }



}
