package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) { // 5
        int cnt = 1, pwr = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(1);
        }
        while (cnt <= power) {
            pwr *= 2;
            System.out.println(pwr);
            cnt++;
        }
    }
}