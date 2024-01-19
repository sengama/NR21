import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Bună ziua");
        words.add("lumea");

        StringJoiner joiner = new StringJoiner();
        String result = Joiners.fold(words, joiner);

        System.out.println(result);
    }
}