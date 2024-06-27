import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {


        int myAge = 27;

        int[] myAgeArray = new int[3];

        int[] myOtherArray = {27, 36, 63, 12};


        System.out.println(myOtherArray[0]);
        System.out.println(myOtherArray[2]);

        myAgeArray[0] = 96;

        System.out.println(myAgeArray[0]);

        System.out.println(Arrays.toString(myOtherArray));

        String[] ourNames = new String[10];

        System.out.println(myAgeArray[1]);
        System.out.println(ourNames[1]);

        ourNames[0] = "Florian";
        ourNames[1] = "Marcel";
        ourNames[2] = "Rinae";
        ourNames[3] = "Simon";
        ourNames[4] = "Karl";
        ourNames[5] = "Fabian";
        ourNames[6] = "Olga";
        ourNames[7] = "Ursula";

//        System.out.println(ourNames[0]);
//        System.out.println(ourNames[1]);
//        System.out.println(ourNames[2]);
//        System.out.println(ourNames[3]);
//        System.out.println(ourNames[4]);
//        System.out.println(ourNames[5]);
//        System.out.println(ourNames[6]);
//        System.out.println(ourNames[7]);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hallo " + ourNames[i]);
        }

        for(String currentName : ourNames) {
            System.out.println("Tschüüs " + currentName);
        }
    }
}
