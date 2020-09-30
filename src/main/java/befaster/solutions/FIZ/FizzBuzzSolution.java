package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer n) {
        int fizz=0;  //1 adev, 0 fals
        int buzz=0;

        if( n % 3 == 0 ){
            int number = n;
            while( number > 0 ){
                int cifra = number%10;
                number= number/10;
                if(cifra==3) {
                    fizz = 1;
                    break;
                }
            }
        }

        if( n % 5 == 0 ){
            int number = n;
            while( number > 0 ){
                int cifra = number%10;
                number= number/10;
                if(cifra==5) {
                    buzz = 1;
                    break;
                }
            }
        }
        if( fizz == 1 && buzz == 1){
            return "fizz buzz";
        }else if(fizz == 1){
            return "fizz";
        }else if(buzz == 1){
            return "buzz";
        }else{
            return Integer.toString(n);
        }





    }


}

