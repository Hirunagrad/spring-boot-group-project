public class Factorial {
    public static int findFactorial(int number){
        if (number==0){
            return 1;
        }else{
            return number * findFactorial(number -1);
        }

    }
}
