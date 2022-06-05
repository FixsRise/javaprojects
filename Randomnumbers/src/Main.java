public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 11000; i++){
            int random = (int) ((1 + Math.random() * 10)*10);
            if (random == 10 || random == 109){
                count += 1;
                //System.out.println(random);
            }

        }
        //System.out.println(count);

        int random2 = (int) (((1+ Math.random() * 10)*10));
        String string = String.format("Random number: %s...Try again", random2);
        System.out.println(string);


    }


}
