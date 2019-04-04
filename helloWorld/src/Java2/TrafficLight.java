package Java2;

public class TrafficLight {
    public static void main(String[] args) {
        redLightGreenLight(5);
    }

    private static void redLightGreenLight(int time) {
        int[] arr1 = {1,2,6,7,11,12,16,17,21,22,26,27,31,32,36,37,41,42,46,47,51,52,56,57}; // It's green
        int[] arr2 = {3,8,13,18,23,28,33,38,43,48,53,58}; // It's green, but soon be red
        int[] arr3 = {4,9,14,19,24,29,34,39,44,49,54,59}; // It's red
        int[] arr4 = {5,10,15,20,25,30,35,40,45,50,55,60}; // It's red, but soon be green

        for(int i = 0; i < arr1.length; i++) {
            if (time == arr1[i]) {
                System.out.println("Green light");
            }

        }

        for (int i = 0; i < arr2.length; i++) {

            if(time == arr2[i]) {
                System.out.println("It's green, but soon to be red");
            }
        }

        for (int i = 0; i < arr3.length; i++) {

            if(time == arr3[i]) {
                System.out.println("It's red");
            }
        }

        for (int i = 0; i < arr4.length; i++) {

            if(time == arr4[i]) {
                System.out.println("It's red, but soon to be green");
            }
        }

    }
}
