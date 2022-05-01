import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 01/05/2022, domenica
 **/
public class Main {
    public static void main(String[] args) {
        JTextField base = new JTextField(5);
        JTextField altezza = new JTextField(5);
        JTextField area = new JTextField(5);
        JButton calcola = new JButton("CALCOLA");
        JButton cancella = new JButton("CANCELLA");
        JLabel lBase = new JLabel("lunghezza base");
        JLabel lAltezza = new JLabel("lunghezza altezza");
        JLabel lArea = new JLabel("misura area");

        JFrame mainFrame = new JFrame("AREA RETTANGOLO");
        mainFrame.setSize(300,200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //x centrare il Frame nello schermo
        mainFrame.setLocationRelativeTo(null);

        JPanel body = new JPanel();
        body.setLayout(new GridLayout(3,1));
        //body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
        JPanel baseAlt = new JPanel(new GridLayout(2,2));
        JPanel btns = new JPanel();
        JPanel areaPanel = new JPanel();

        area.setEditable(false);
        calcola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int b = Integer.parseInt(base.getText());
                int a = Integer.parseInt(altezza.getText());
                area.setText(Integer.toString(a * b));
            }
        });
        cancella.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                base.setText("");
                altezza.setText("");
                area.setText("");
            }
        });

        //aggiungo al sottopannello
        baseAlt.add(lBase);
        baseAlt.add(base);
        baseAlt.add(lAltezza);
        baseAlt.add(altezza);

        btns.add(calcola);
        btns.add(cancella);

        areaPanel.add(lArea);
        areaPanel.add(area);

        //aggiungo al body
        body.add(baseAlt);
        body.add(btns);
        body.add(areaPanel);

        mainFrame.getContentPane().add(BorderLayout.CENTER,body);
        mainFrame.setVisible(true);
    }
}
