package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int cnt = 1, sum = 1;
        System.out.println(1);
        while(cnt <= printToInclusive) {
            sum *= cnt;
            cnt++;
            System.out.println(sum);
        }
    }
}
