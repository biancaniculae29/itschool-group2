public class Exercise12 {
    public static void main(String[] args) {
        //12. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.

        int myNumber = (int) (Math.random() * 190) + 1;

        System.out.println(myNumber++);
        System.out.println(myNumber--);
        System.out.println(++myNumber);
        System.out.println(++myNumber);
    }
}
