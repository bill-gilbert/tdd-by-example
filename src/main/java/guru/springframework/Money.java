package guru.springframework;

public class Money implements Expression {
    protected final int amount;
    protected final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Expression times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public String currency() {
        return this.currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(amount / bank.rate(this.currency, to), to);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Money money = (Money) o;
        if (money == null || !this.currency().equals(money.currency())) return false;

        return amount == money.amount;
    }

    @Override
    public String toString() {
        return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
    }
}