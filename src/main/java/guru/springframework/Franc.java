package guru.springframework;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }

    public int getAmount() {
        return amount;
    }

    //
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(amount);
//    }
}