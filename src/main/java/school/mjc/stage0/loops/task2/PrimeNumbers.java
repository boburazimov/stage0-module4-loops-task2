package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int primeNum = 2;
        while (printToInclusive != 0 && printToInclusive != 1 && printToInclusive != primeNum) {
            boolean flag = true;
            for (int i = 2; i <= primeNum / 2; i++){
                if (primeNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(primeNum);
            primeNum++;
        }
    }
}
