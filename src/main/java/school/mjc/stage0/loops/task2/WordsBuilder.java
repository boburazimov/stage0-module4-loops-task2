package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int cnt = 0;
        StringBuilder phrase = new StringBuilder();
        while (cnt < chars.length) {
            phrase.append(chars[cnt]);
            cnt++;
        }
        System.out.print(phrase);
    }
}
