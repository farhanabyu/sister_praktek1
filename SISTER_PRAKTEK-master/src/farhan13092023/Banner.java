/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan13092023;


//import javax.swing.*;
//import java.awt.*;
//
///**
// *
// * @author ASUS ID
// */
//
//class CountDownGUI extends JFrame {
//    JLabel label;
//    CountDownGUI(String title) {
//        super(title);
//        label = new JLabel("Start count!");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        getContentPane().add(new Panel(), BorderLayout.WEST);
//        getContentPane().add(label);
//        setSize(300,300);
//        setVisible(true);
//    }
//    void startCount() {
//        try {
//            for (int i = 10; i > 0; i--) {
//                Thread.sleep(1000);
//                label.setText(i + "");
//            }
//            Thread.sleep(1000);
//            label.setText("Count down complete.");
//            Thread.sleep(1000);
//        } catch (InterruptedException ie) {
//        }
//        label.setText(Thread.currentThread().toString());
//    }
//    public static void main(String args[]) {
//        CountDownGUI cdg = new CountDownGUI("Count down GUI");
//        cdg.startCount();
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Banner extends JPanel implements ActionListener {
//    private String textToDisplay = "Your name here!";
//    private int xPosition = 30;
//    private int endPosition = 250;
//    private Timer timer;
//
//    public Banner() {
//        timer = new Timer(30, this); // 10 milliseconds delay between each step
//        timer.start();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.cyan);
//        g.fillRect(0, 0, getWidth(), getHeight());
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("Consolas", Font.PLAIN, 24));
//        g.drawString(textToDisplay, xPosition, 150);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        xPosition++; // Move text to the right
//        if (xPosition > endPosition) {
//            xPosition = -150; // Reset the text position when it goes out of bounds
//        }
//        repaint();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Banner");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(500, 300);
//            frame.add(new Banner());
//            frame.setVisible(true);
//        });
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Banner extends JFrame {
//    private JLabel textLabel;
//    private String text = "Your name here!";
//    private int xCoordinate = 20; // Koordinat awal X
//
//    public Banner() {
//        setTitle("Banner");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 250);
//        setLocationRelativeTo(null);
//
//        textLabel = new JLabel(text);
//        textLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
//        add(textLabel);
//
//        Timer timer = new Timer(50, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                xCoordinate += 5; // Menggeser teks ke kiri
//                if (xCoordinate > getWidth()) {
//                    xCoordinate = -textLabel.getWidth(); // Kembali ke awal jika mencapai batas kiri
//                }
//                textLabel.setLocation(xCoordinate, 0);
//            }
//        });
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                Banner banner = new Banner();
//                banner.setVisible(true);
//            }
//        });
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Banner extends JFrame {
//    private JLabel textLabel;
//    private String text = "Your name here!";
//    private int xCoordinate = 400; // Koordinat awal X di luar layar
//    private int currentCharIndex = 0;
//
//    public Banner() {
//        setTitle("Banner");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 250);
//        setLocationRelativeTo(null);
//
//        textLabel = new JLabel();
//        textLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
//        add(textLabel);
//
//        Timer timer = new Timer(200, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (currentCharIndex < text.length()) {
//                    String partialText = text.substring(currentCharIndex, currentCharIndex + 1);
//                    textLabel.setText(partialText);
//                    textLabel.setBounds(xCoordinate, 100, 50, 50);
//                    currentCharIndex++;
//                } else {
//                    xCoordinate--;
//                    if (xCoordinate < -50) {
//                        xCoordinate = getWidth();
//                        currentCharIndex = 0;
//                    }
//                }
//            }
//        });
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                Banner banner = new Banner();
//                banner.setVisible(true);
//            }
//        });
//    }
//}

public class Banner {

    private JFrame frame;
    private JPanel bannerPanel;
    private JLabel bannerLabel1;
    private JLabel bannerLabel2;
    private String bannerText1;
    private String bannerText2;
    private int bannerPosition;
    private Timer timer;

    public Banner() {
        frame = new JFrame("Banner Example");
        bannerPanel = new JPanel();
        bannerText1 = "Ahmad Zulveron!";
        bannerText2 = "Ahmad Zulveron!";
        bannerPosition = 0;

        bannerLabel1= new JLabel(bannerText1);
        bannerLabel1.setFont(new Font("Consolas", Font.PLAIN, 24));

        bannerLabel2= new JLabel(bannerText2);
        bannerLabel2.setFont(new Font("Consolas", Font.PLAIN, 24));
        
        bannerPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        bannerPanel.add(bannerLabel1);
        bannerPanel.add(bannerLabel2);

        frame.add(bannerPanel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveBanner();
            }
        });

        timer.start();
    }

    private void moveBanner() {
        bannerPosition++;
        if (bannerPosition > bannerText1.length()) {
            bannerPosition = 0;
        }

       String displayText1 = bannerText1.substring(bannerPosition) + bannerText1.substring(0, bannerPosition);
       String displayText2 = bannerText2.substring(bannerPosition) + bannerText2.substring(0, bannerPosition);
       
       bannerLabel1.setText(displayText1);
       bannerLabel2.setText(displayText2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Banner().frame.setVisible(true);
            }
        });
    }
}
