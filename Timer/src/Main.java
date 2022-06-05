public class Main {

    static boolean IsTimerWork = false;

    public static void main(String[] args) {


        Thread timer = new Thread(new Runnable() {
            int s = 0;
            int m = 0;
            int h = 0;

            @Override
            public void run() {

                try {

                    while (!IsTimerWork) {
                        s++;
                        if (s == 60) {
                            s = 0;
                            m += 1;
                            if(m == 60){
                                m = 0;
                                h += 1;
                            }
                        }
                        System.out.println(h + ":" + m + ":" + s);
                        Thread.sleep(1000);
                    }
                } catch (Exception e){}
            }
        });

        timer.start();

    }

}
