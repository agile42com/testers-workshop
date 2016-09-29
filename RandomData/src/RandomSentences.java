import java.util.Random;

public class RandomSentences {

    String[] subjects = {"He", "She", "Stefano", "Niels", "They", "We"};
    String[] verbs = {"is", "am"};
    String[] verbs2 = {"going", "leaving", "drinking", "sleeping", "walking", "flying"};
    String[] objects = {"computer", "phone", "table", "tablet", "glass", "window"};
    String[] complements = {"developer", "nice", "great", "awesome", "disgusting"};
    String[] adverbials = {"early", "home", "tomorrow", "carefully", "yesterday", "late"};
    String[][] types = {subjects, verbs, verbs2, objects, complements, adverbials};

    public static void main(String[] args) {
        RandomSentences sentences = new RandomSentences();
        sentences.generate();
    }

    public void generate() {
        Random random = new Random();

        for (int i=0; i< 20; i++) {
            System.out.print("\"");
            for(String[] type : types) {
                System.out.print(type[random.nextInt(type.length)]+" ");
            }
            System.out.println("\"");
        }
    }
}
