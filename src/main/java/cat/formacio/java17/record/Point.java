package cat.formacio.java17.record;

/**
 * Particularietats:
 * - Es immutable.
 * - No es heredable.
 *
 * Compte: no es fa els getters i setters.
 * @param x
 * @param y
 */
public record Point (double x, double y) {
}
