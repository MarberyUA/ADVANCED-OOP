package main;

public class Main {
    public static void main(String[] args) throws SideSizeException {
        String[] output = Randomable.randomize();
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i]);
        }
    }
}
