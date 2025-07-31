package mypackage;
public class LeftAndRightShift {
    public static void main(String[] args) {
        int number = 8; 
        int leftShift = number << 1; 
        int rightShift = number >> 1; 
        System.out.println("Original number: " + number);
        System.out.println("Left shift (number << 1): " + leftShift);
        System.out.println("Right shift (number >> 1): " + rightShift);
    }
}
