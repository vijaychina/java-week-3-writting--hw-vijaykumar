package homework_week_3;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_DivideByThreeANDFive {
    public static void main(String[] args) {
        System.out.println("Number divisible by 5 are :");
        for (int i = 1; i <= 100; i++){
            divideByThree(i);
        }
        System.out.println("\n-------------------------------------------------------");
        System.out.println("numbers divisible by 5 are : ");
        for (int x = 1; x <=100; x++){
        }
    }
    //diveded by three method
    public static void divideByThree(int number){
        if (number % 3 ==0){
            System.out.println(number + " , ");
        }
    }
    //Divided by Five method
    public static void divideByFive(int number){
        if (number % 5 == 0){
            System.out.println(number + " , ");
        }
    }
}
