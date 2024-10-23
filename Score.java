package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name , int score){


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(400,100,750,550);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);


        JLabel heading = new JLabel("Thank you" + name + "for playing Simple minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tohoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your  Score is :"+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tohoma", Font.PLAIN, 26));
        add(lblscore);


        JButton submit = new JButton("Play Again ");
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        submit.setBounds(400,270,120,30);
        submit.addActionListener(this);
        add(submit);


        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Login();

    }



    public static void main(String[] args) {

        new Score("user",0);

    }
}
