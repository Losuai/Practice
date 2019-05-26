package nonaccessmodifier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OuterStatic {

    public static class InnerStaticSimpleDateFormat  implements Runnable {
        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName()
                            +":"+DateUtil.parseToDate("2017-07-27 08:02:20"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            new Thread(new InnerStaticSimpleDateFormat(), "测试线程").start();

        }

    }
}

class DateUtil {

    private static  volatile SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static  String formatFromDate(Date date)throws ParseException{
        return sdf.format(date);
    }
    public static Date parseToDate(String strDate) throws ParseException {

        return sdf.parse(strDate);
    }
}
