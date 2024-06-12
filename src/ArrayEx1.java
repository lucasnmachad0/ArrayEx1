public class ArrayEx1 {

    public static void main(String args[]) {
        // Declare a one-dimensional array named score of type int that can hold 9 values
        int[] score = new int[9];

        // Declare and initialize a one-dimensional array of bytes named values with size 10 so that all entries contain 1
        byte[] values = new byte[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        // System.out.println("score: " + score);
        // System.out.println("values: " + values);

        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
    }

}
