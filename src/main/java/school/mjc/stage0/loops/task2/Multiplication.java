package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int inputNum = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : multiplyByAndToInclusive * -1;
        int count = 0;
        while (inputNum >= count && multiplyByAndToInclusive != 0) {
            System.out.println(multiplyByAndToInclusive * count);
            count++;
        }
    }
}
