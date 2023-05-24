package guru.springframework;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    void addRate(String from, String to, int rate) {
        this.rateMap.put(new Pair(from,to), rate);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }

        return this.rateMap.get(new Pair(from,to));
    }
}
