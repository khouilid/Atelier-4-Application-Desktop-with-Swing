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
                window.setBackground(Color.red);
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
        btn_1.setBackground(Color.ORANGE);
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
                         "Babies have around 100 more bones than adults",
                         "The Eiffel Tower can be 15 cm taller during the summer",
                         "20% of Earth’s oxygen is produced by the Amazon rainforest"
                        };
        Random r = new Random();
        int low = 0;
        int high = 3;
        int result = r.nextInt(high - low) + low;
        return tips[result];
    }
}
