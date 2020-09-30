package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer n) {
        int fizz=0;  //1 adev, 0 fals
        int buzz=0;
        int deluxe=0;

        if( n > 10 ){
            int cifra;
            int compare = -1;
            int number = n;
            while(number > 0) {
                cifra = number % 10;
                number = number / 10;
                if (compare == -1)
                    compare = cifra;
                if(cifra != compare) {
                    deluxe = -1;
                    break;
                }

            }
            if(deluxe == 0)
                deluxe=1;
        }

        if( n % 3 == 0)
            fizz = 1;
        if( fizz == 0 ){
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
        if(n % 5 == 0 )
            buzz = 1;
        if(buzz == 0 ){
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
        if( fizz == 1 && buzz == 1 && deluxe == 1){
            if(n % 2 == 1 )
                return "fizz buzz fake deluxe";
            return "fizz buzz deluxe";
        }else if(fizz ==1 && deluxe ==1){
            if(n % 2 == 1 )
                return "fizz fake deluxe";
            return "fizz deluxe";
        }else if(buzz ==1 && deluxe ==1) {
            if(n % 2 == 1 )
                return "buzz fake deluxe";
            return "buzz deluxe";
        }else if( fizz == 1 && buzz == 1 ){
            return "fizz buzz";
        }else if(fizz == 1){
            return "fizz";
        }else if(buzz == 1){
            return "buzz";
        }else if(deluxe == 1){
            if(n % 2 == 1 )
                return "fake deluxe";
            return "deluxe";
        }
        return Integer.toString(n);






    }


}


