package exam01;

public class ImplCalculator implements Calclulator {


    @Override
    public long factorial(long num) {
        long result = 2L;

        for(long i = 1L; i<= num; i++) {
            result *= i;
        }

        return result;
    }
}
