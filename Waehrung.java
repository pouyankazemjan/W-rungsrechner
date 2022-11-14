import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Waehrung {

   static JLabel text = new JLabel("Bitte geben sie eine Betrag  ein!" );//Label bauen

   static JTextField textField = new JTextField();//text feld definieren
    static Integer tries = 0; //wiederhollen definieren
    //static Double euro = new JFrame;
    public static void main(String[] args){
        //Scanner scanner = new Scanner (System.in);
        //System.out.println("bitte geben Sie euro betrag ein :");
        //double euro =12;


        openuI();
    }
    public static void openuI(){ //benuzer in hintergerund bauen
        JFrame frame =new JFrame("In Euro ");// fensteraufmachen titel iengeben
        frame.setSize(400,300);// die Große der fenster eingeben
        frame.setLocation(100,150);//ort der fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//beenden automatisch
        frame.setDefaultLookAndFeelDecorated(true);//steil von fesnter Dising


        text.setBounds(50,50,400,30);//size das Label


        textField.setBounds(50,100,200,30);//textfeld


        JButton button = new JButton("Eingeben ");// taster
        button.setBounds(50,150,200,30);//grosse der taster

        button. addActionListener(new ActionListener() {//nach dem Taster gedruckt ausgeführt wird
            @Override
            public void actionPerformed(ActionEvent e){

                String textFromTextfield = textField.getText();
             Double euro = Double.parseDouble(textFromTextfield);
             mony(euro);


            }
        });//Führt funktion aus,wenn a // f den Button geklickt wird
        frame.setLayout(null);//text nach eingabe nicht verschwenden platz machen
        frame.setVisible(true);//zeigen das labal
        frame.add(text);//zeigen
        frame.add(textField);
        frame.add(button);

    }
    public static void mony (double euro) {
        //System.out.println("in euro ist = " + euro * 1.20 + "Doller ");
       // System.out.println("in euro ist = " + euro * 1.45 + "Pfund ");
        //System.out.println("in euro ist = " + euro * 30000 + "Toman" );
        tries++;

        text.setText( euro * 1.20 + "Doller "  +  euro * 1.45+ "Pfund "   + euro * 30000 + "Toman");
        //text.setText("in euro ist = " + euro * 1.45+ "Doller ");
        //text.setText("in euro ist = " + euro * 30000 + "Toman" );
        textField.setText("");
    }

}

