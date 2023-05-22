package guru.springframework;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int multiple) {
        return new Dollar(this.amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
