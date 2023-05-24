package cat.formacio.java17;

import cat.formacio.model.Customer;
import cat.formacio.model.Order;

import javax.swing.undo.CannotUndoException;

public class NullPointerExceptionApp {

    public static void main(String[] args) {

        NullPointerExceptionApp nullPointerExceptionApp = new NullPointerExceptionApp();

        nullPointerExceptionApp.provaNullPointerException();


    }

    /**
     * Informa molt millor del nullPointer:
     *
     * Exception in thread "main" java.lang.NullPointerException:
     * Cannot invoke "cat.formacio.model.Pais.getNomPais()"
     * because the return value of "cat.formacio.model.Order.getPais()" is null
     */
    private void provaNullPointerException() {

        Customer customer = new Customer();

        customer.setNom("Xavier");

        Order order = new Order();

        order.setComanda("Comanda1");

        customer.setOrder(order);

        System.out.println(customer.getOrder().getPais().getNomPais());

    }

}
