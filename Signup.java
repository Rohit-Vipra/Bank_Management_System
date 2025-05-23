package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
     JTextField textName,textFName,textEmail,textMs,textAdd,textCity,textPin,textState;
     JDateChooser dateChooser;
    Random r =new Random();
    long num=(r.nextLong() % 9000L) + 1000L;
    String number = " " + Math.abs(num);
    Signup()
    {
       super("APPLICATION FORM");
        ImageIcon a = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/bank.png")));
        Image a1= a.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon a2 =new ImageIcon(a1);
        JLabel image = new JLabel(a2);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel(" APPLICATION FORM NO : "+number);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel(" Page 1 ");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel(" Personal Details ");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel label4 = new JLabel("Name : ");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(100,190,100,30);
        add(label4);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel label5 = new JLabel("Father's Name : ");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,240,200,30);
        add(label5);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,290,120,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail =  new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs =  new JLabel("Marital Status : ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelAdd =  new JLabel("Address : " );
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity =  new JLabel("City : " );
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin =  new JLabel("Pin Code : " );
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState =  new JLabel("State : " );
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = number;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
          gender="Male";
        }
        else if(r2.isSelected())
        {
         gender="Female";
        }
        else{
         gender="Other";
        }
        String email = textEmail.getText();
        String maritial=null;
     if(m1.isSelected())
     {
      gender="Married";
     }
     else if(m2.isSelected())
     {
      gender="Unmarried";
     }
     String address = textAdd.getText();
     String city=textCity.getText();
     String pincode=textPin.getText();
     String state=textState.getText();

     try{
      if(textName.getText().equals(""))
      {
       JOptionPane.showMessageDialog(null,"Fill All The Details");
      }
      else {
       Conn con1=new Conn();
       String q = "INSERT INTO signup1 (form_no, name, father_name, dob, gender, email, Married_Status, address, city, pincode, state) VALUES ('"
               + number + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + maritial + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";

       con1.getStatement().executeUpdate(q);

       new Signup2(formno);
       setVisible(false);
      }
     }catch (Exception E)
     {
      E.printStackTrace();
     }
    }


    public static void main(String[] args)
    {
        new Signup();
    }
}
