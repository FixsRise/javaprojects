public class Main {

    static boolean win = false;

    public static void main(String[] args) {

        int random = (int)(Math.random() * 1000000);
        System.out.println("===== " + random + " =====");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!win) {

                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e){}
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!win) {
                        int random2 = (int) (Math.random() * 1000000000);
                        if (random2 == random) {

                            System.out.println("=====" + random2 + "=====");
                            win = true;
                        }
                    }
                } catch (Exception e){}
            }
        });

        thread1.start();
        thread2.start();

    }
}
