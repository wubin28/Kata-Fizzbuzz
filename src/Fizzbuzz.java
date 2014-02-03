import java.util.HashMap;
import java.util.Map;

public class Fizzbuzz {
    public String convert(final int number) {
        Map<String, String> convertorToString = new HashMap<String, String>(){{
            put("" + false + false, String.valueOf(number));
            put("" + true + false, "fizz");
            put("" + false + true, "buzz");
            put("" + true + true, "fizzbuzz");
        }};

        return convertorToString.get("" + isFizz(number) + isBuzz(number));
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
