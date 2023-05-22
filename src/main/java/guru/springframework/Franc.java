package guru.springframework;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int multiple) {
        return new Franc(this.amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
