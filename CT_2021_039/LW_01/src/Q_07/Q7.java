package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {

        public static void main(String[] args){
            JFrame frame=new JFrame();

            frame.setSize(800,600);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Timer timer=new Timer(1000,e -> {
                String currentTime=new SimpleDateFormat("hh:mm:ss a").format(new Date());
                frame.setTitle(currentTime);
            } );
            timer.start();
            frame.setVisible(true);

        }
    }


