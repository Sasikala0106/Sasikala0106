package Q_04;

import java.util.Date;
import java.text.SimpleDateFormat;

    public class Main4 {
        public static void main(String[] args){
            Date today=new Date();

            SimpleDateFormat dateFormat = new SimpleDateFormat("d MM yyyy");

            String formattedate = dateFormat.format(today);

            System.out.println("Today's date is:"+formattedate);


        }
    }


