package GUIExamples;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login1 extends JFrame implements ActionListener
{
    JPanel p1;
    JPanel p2;
    JLabel l1,luid,lpwd;
    JTextField tuid;
    JPasswordField ppw;
    JButton blogin,breset;

    Login1()
    {

        this.setTitle("LOGIN FORM");
        p1=new JPanel();
        p2=new JPanel();
        Container con=getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(p1);
        con.add(p2);
        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.PINK);
        l1=new JLabel("WELCOME TO KONERU LAKSHMAIAH EDUCATION FOUNDATION  VIJAYAWADA");
        p1.add(l1);
        luid=new JLabel("Enter Login ID");
        lpwd=new JLabel("Enter Password");
        tuid=new JTextField(30);
        ppw=new JPasswordField(30);
        blogin=new JButton("LOGIN");
        breset=new JButton("RESET");
        p2.setLayout(new GridLayout(3,2));
        p2.add(luid);
        p2.add(tuid);
        p2.add(lpwd);
        p2.add(ppw);
        p2.add(blogin);
        p2.add(breset);
        this.pack();
        blogin.addActionListener(this);
        breset.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String uid,pwd;
        if(ae.getSource()==blogin)
        {
            uid=tuid.getText();
            pwd=new String(ppw.getPassword());
            if(uid.equals("klu")&&pwd.equals("klu123"))
                System.out.println("User allowed to access");

            else
                System.out.println("Login id or password is incorrect");
        }
        if(ae.getSource()==breset)
        {
            tuid.setText("");
            ppw.setText("");
        }
    }
    public static void main(String args[])
    {
        Login1 l=new Login1();
        l.setVisible(true);
        l.setSize(800, 400);
    }
}
