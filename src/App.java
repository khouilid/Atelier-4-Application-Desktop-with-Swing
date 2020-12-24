import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App {
    private JButton btn_1;
    private JFrame window;
    private JLabel area = new JLabel();

    public App() {
        createUIComponents();
        title();
        btn();
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text(area,tips());
                Color color = color();
                window.getContentPane().setBackground(color);
                btn_1.setForeground(color);
            }
        });
    }

    private void createUIComponents() {
        window = new JFrame("Windows");
        window.setSize(500, 400);

        window.setLayout(null);
        window.setVisible(true);
    }

    private void btn(){
        String txt = "Montrer un autre fait".toUpperCase();
        this.btn_1 = new JButton(txt);
        btn_1.setBounds(110, 300, 300, 40);
        btn_1.setBackground(Color.BLUE);
        btn_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        btn_1.setBorderPainted(false);
        window.add(btn_1);

    }

    private void text(JLabel area, String txt) {
        area.setBounds(10, 130, 350, 60);
        area.setText(txt);
        area.setFont(new Font("Verdana", Font.PLAIN, 15));
        window.add(area);

    }

    private void title() {
        JLabel area = new JLabel("Le saviez-vous");
        area.setBounds(10, 10, 400, 30);
        area.setHorizontalAlignment(JLabel.CENTER);
        window.add(area);
    }

    private String tips() {
        String[] tips = {
                         "<html><h2>Babies have around 100 more bones than adults</h2></html>",
                         "<html><h2>The Eiffel Tower can be 15 cm taller during the summer</h2></html>",
                         "<html><h2>20% of Earth’s oxygen is produced by the Amazon rainforest</h2></html>"
                        };

        return tips[getRandom()];
    }


    private Color color(){
        Color[] clr = {Color.RED, Color.ORANGE, Color.WHITE};
        return  clr[getRandom()];

    }


    private int getRandom(){
        Random r = new Random();
        int low = 0;
        int high = 3;
        return r.nextInt(high - low) + low;
    }
}
