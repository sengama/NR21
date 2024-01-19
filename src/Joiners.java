import java.util.ArrayList;

class Joiners {
    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner) {
        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = joiner.join(result, list.get(i));
        }
        return result;
    }
}