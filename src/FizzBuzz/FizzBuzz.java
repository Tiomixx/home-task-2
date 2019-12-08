package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 347693485;
        for(int i= 0; i <= n; i++){
            int a = n%10;
            n = n/10;
            if(a % 2 == 0 && a % 3 == 0){
                System.out.println("FizzBuzz");

            }else if(a % 2 == 0){
                System.out.println("Fizz");
            }else if(a % 3 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(a);
            }
        }

    }
}
