package cat.formacio.model;

public sealed  abstract class Payment permits CreditCardPayment, CashPayment {
}
