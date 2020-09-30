package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        throw new SolutionNotImplementedException();
    }
    public String fizz_buzz(Integer n){

        if(n % 3 == 0 && n % 5 == 0) {
            return "fizz buzz";
        }else if(n % 3 == 0){
            return "fizz";
        }else if(n % 5 == 0){
            return "buzz";
        }else{
            return Integer.toString(n);
        }

    }

}


