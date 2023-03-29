class Dollar extends Money {
  Dollar(int amount) {
    this.amount = amount;
    currency = "USD";
  }

  public Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }

}