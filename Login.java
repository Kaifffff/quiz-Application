package Quiz.Application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends javax.swing.JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;

    Login(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("image/login.jpeg"));
        JLabel image = new JLabel(i);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(800,150,300,45);
        name.setFont(new Font("Times New Roman", Font.BOLD, 18));
        name.setForeground(Color.blue);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(750,200,300,45);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18 ));
        add(tfname);


        rules = new JButton("Rules");
        rules.setBounds(750,270,120,25);
        rules.addActionListener(this);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.white);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.addActionListener(this);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        add(back);





        setLocation(100,50);
        setSize(1200,500);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if(e.getSource() == back){
            setVisible(false);
        }

    }


    public static void main(String[] args) {
        new Login();
    }
}
