package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Objects;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField1;
    JPasswordField passwordField1;
    JButton button1,button2,button3;

    Login(){
        super("Bank Management System");
        ImageIcon a = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/bank.png")));
        Image a1= a.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon a2 =new ImageIcon(a1);
        JLabel image = new JLabel(a2);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon b = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/card.png")));
        Image b1= b.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon b2 =new ImageIcon(b1);
        JLabel image1 = new JLabel(b2);
        image1.setBounds(630,350,100,100);
        add(image1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setBounds(230,125,450,40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        add(label1);

        label2 = new JLabel("Card Number : ");
        label2.setBounds(130,190,375,30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(325,190,230,30);
        textField1.setFont(new Font("Arial",Font.BOLD,14));
        add(textField1);

        label3 = new JLabel("PIN : ");
        label3.setBounds(150,250,375,30);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("AvantGarde",Font.BOLD,28));
        add(label3);

        passwordField1 = new JPasswordField(15);
        passwordField1.setBounds(325,250,230,30);
        passwordField1.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField1);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBounds(300,300,100,30);
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBounds(430,300,100,30);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBounds(300,350,230,30);
        button3.setBackground(Color.BLACK);
        button3.addActionListener(this);
        add(button3);

        ImageIcon c= new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/backbg.png")));
        Image c1= c.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon c2 =new ImageIcon(c1);
        JLabel image2 = new JLabel(c2);
        image2.setBounds(0,0,850,480);
        add(image2);

        setLayout(null);
        setSize(850,480);
        setUndecorated(true);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1)
            {
                Conn c=new Conn();
                String cardno=textField1.getText().trim();
                String pin= passwordField1.getText().trim();
                String q = "SELECT * FROM login WHERE Card_Number='"+cardno+"'AND PIN='"+pin+"'";
                System.out.println("Executing SQL Query: " + q); // Debugging

                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    System.out.println("Login Successful! Card: " + cardno);
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    setVisible(false);
                    new Main_Class(pin);
                } else {
                    System.out.println("Invalid Login! Card: " + cardno + ", PIN: " + pin);
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }

            }
            else if(e.getSource()==button2)
            {
                textField1.setText("");
                passwordField1.setText("");
            }
            else if(e.getSource()==button3)
            {
                new Signup();
                setVisible(false);
            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

    new Login();
    }
}