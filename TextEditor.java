import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class TextEditor implements ActionListener {
    public static void main(String [] args){
        new TextEditor();
    }  // main function ends here
    JFrame frameTE;
    JPanel panelTE;
    JTextArea textAreaTE;
    JButton bold, unBold, italic,unItalic,unUnderline, underline;
    JButton save, clear;
    JScrollPane jScrollPnael;
    final int rows = 21;
    final  int cols = 75;

    TextEditor(){

//FRAME
        frameTE = new JFrame();
        frameTE.setTitle("uDocs");
        frameTE.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameTE.setLayout(null);
        frameTE.setBounds(0,0,1366,735);
        frameTE.getContentPane().setBackground(Color.WHITE);

//BUTTONS
        bold= new JButton("B");
        bold.setBounds(5,5,50,50);
        bold.addActionListener(this);

        frameTE.add(bold);

        unBold = new JButton("B");
        unBold.setBounds(5,5,50,50);
        unBold.addActionListener(this);
        unBold.setBackground(new Color(193,255,255));
        frameTE.add(unBold);

        italic= new JButton("I");
        italic.setBounds(60,5,50,50);
        italic.addActionListener(this::actionPerformed);
        frameTE.add(italic);

        unItalic= new JButton("I");
        unItalic.setBounds(60,5,50,50);
        unItalic.addActionListener(this::actionPerformed);
        unItalic.setBackground(new Color(193,255,255));
        frameTE.add(unItalic);


        underline= new JButton("U");
        underline.setBounds(115,5,50,50);
        underline.addActionListener(this::actionPerformed);
        frameTE.add(underline);

        unUnderline= new JButton("U");
        unUnderline.setBounds(115,5,50,50);
        unUnderline.addActionListener(this::actionPerformed);
        unUnderline.setBackground(new Color(193,255,255));
        frameTE.add(unUnderline);

        save= new JButton("Save");
        save.setBounds(1100,5,100,50);
        save.addActionListener(this::savePerformed);
        frameTE.add(save);

        clear= new JButton("Clear");
        clear.setBounds(1225,5,100,50);
        clear.addActionListener(this::actionPerformed);
        frameTE.add(clear);



        textAreaTE = new JTextArea(21,45);
        textAreaTE.setLineWrap(true);
        textAreaTE.setWrapStyleWord(true);
        textAreaTE.setFont(new Font("Tohama",Font.PLAIN,23));




//PANEL
        panelTE = new JPanel();
        panelTE.setBounds(0,60,1366,635);


        panelTE.add(textAreaTE);
        frameTE.add(panelTE);
        frameTE.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bold){
            textAreaTE.setFont(new Font("Tohama",Font.BOLD,23));
            bold.setVisible(false);
            unBold.setVisible(true);

            //bold.setBackground(new Color(120 ,130,250));

        }else if (e.getSource() == unBold){
            textAreaTE.setFont(new Font("Tohama",Font.PLAIN,23));
            bold.setVisible(true);
            unBold.setVisible(false);
        }


        if (e.getSource() == italic){
            textAreaTE.setFont(new Font("Tohama",Font.ITALIC,23));
            italic.setVisible(false);
            unItalic.setVisible(true);
        } else if (e.getSource()==unItalic) {
            textAreaTE.setFont(new Font("Tohama",Font.PLAIN,23));
            italic.setVisible(true);
            unItalic.setVisible(false);
        }

        if (e.getSource()== underline){
            Font font = textAreaTE.getFont();
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textAreaTE.setFont(font.deriveFont(attributes));
            underline.setVisible(false);
            unUnderline.setVisible(true);

        } else if (e.getSource()==unUnderline) {
            textAreaTE.setFont(new Font("Tohama",Font.PLAIN,23));
            unUnderline.setVisible(false);
            underline.setVisible(true);

        }

        if(e.getSource()== bold && e.getSource()==italic && e.getSource()==underline){

            Font font = textAreaTE.getFont();
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textAreaTE.setFont(font.deriveFont(attributes));

            textAreaTE.setFont(new Font("Tohama",Font.ITALIC,23));

            textAreaTE.setFont(new Font("Tohama",Font.BOLD,23));
        }
        if(e.getSource() == clear){
            textAreaTE.setText("");
        }
    }
    public void savePerformed(ActionEvent ae){

        try (PrintWriter out = new PrintWriter("MyFile.txt")){
            out.println(textAreaTE.getText());
        }catch (FileNotFoundException ffe){
            ffe.printStackTrace();
        }
        System.out.println("Save Successful");
    }
}
