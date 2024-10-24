package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends javax.swing.JFrame implements ActionListener {
    String name;
    JButton back,start;

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);


        JLabel heading = new JLabel("Welcome " + name + " To Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel rules = new JLabel("Welcome " + name + " To Simple Minds");
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        add(rules);


        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.addActionListener(this);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.addActionListener(this);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        add(start);



        setLocation(350,20);
        setSize(800, 650);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == start){
            setVisible(false);
            new Quiz(name);


        }else if(e.getSource() == back){
            setVisible(false);
            new Login();
        }
    }


    public static void main(String[] args) {
        new Rules("user");
    }
}
