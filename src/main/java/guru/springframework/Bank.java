package guru.springframework;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression source) {
        return source.reduce(this, "USD");
    }

    public void addRate() {
        this.rateMap.put(new Pair("CHF", "USD"), 2);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }

        return this.rateMap.get(new Pair(from,to));
    }
}
