public abstract class Money {
  protected int amount;
  protected String currency;

  public boolean equals(Object object) {
    Money money = (Money) object;
    return money.amount == amount && getClass().equals(money.getClass());
  }

  static Money dollar(int amount) {
    return new Dollar(amount);
  }

  static Money franc(int amount) {
    return new Franc(amount);
  }

  String currency() {
    return currency;
  }

  abstract Money times(int multiplier);
}
