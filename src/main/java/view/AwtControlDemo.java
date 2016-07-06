package view;

import org.joda.time.LocalTime;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by NICOLA on 06/07/2016.
 */
public class AwtControlDemo {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    LocalTime currentTime = new LocalTime();

    public AwtControlDemo(){
        prepareGUI();
    }

    public void prepareGUI()
    {
        mainFrame = new Frame("Java AWT Examples - Presentation");
        mainFrame.setSize(600,600);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }

    public void showCanvasDemo( String s ){
        headerLabel.setText( s );

        controlPanel.add(new MyCanvas());
        mainFrame.setVisible(true);
    }


    class MyCanvas extends Canvas {

        public MyCanvas() {
            setBackground(Color.GRAY);
            setSize(500, 500);
        }


        public void paint(Graphics g) {
            Graphics2D g2;
            g2 = (Graphics2D) g;
            g2.drawString("It is a custom canvas area", 70, 70);
        }
    }
}
//Se cambio il testo all'interno di "drawstring" non viene più visualizzato
//il canvas.