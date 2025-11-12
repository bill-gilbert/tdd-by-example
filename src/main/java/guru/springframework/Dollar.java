package guru.springframework;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(amount);
//    }
}