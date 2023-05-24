package cat.formacio.model;

/**
 * non-sealed -> A partir d'ara, li permeto a qualsevol objecte que extengui d'aquest objecte (no del pare).
 *
 * Si posés:
 *
 * public sealed class CreditCardPayment extends Payment {
 *
 * Li he de definir les noves regles de a qui permeto extendre. Donarà problemes de compilicació.
 */
public non-sealed class CreditCardPayment extends Payment {
}
