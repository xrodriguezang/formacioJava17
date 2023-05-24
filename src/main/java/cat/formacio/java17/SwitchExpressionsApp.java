package cat.formacio.java17;

public class SwitchExpressionsApp {

    enum  OrderStart {
        ORDERED, COOKING, DELIVERED, CANCELLED
    }

    public static void main(String[] args) {

        SwitchExpressionsApp switchExpressionsApp = new SwitchExpressionsApp();

        switchExpressionsApp.treballarSwitchFinsAra();
        switchExpressionsApp.treballarSwitch();
        switchExpressionsApp.treballarSwitchYield();
        switchExpressionsApp.treballarSwitchYieldExcepcio();

    }

    /**
     * Sistema que s'ha utilitzat fins ara per fer Switch.
     */
    private void treballarSwitchFinsAra() {
        OrderStart status = OrderStart.COOKING;

        switch (status) {
            case COOKING:
            case ORDERED:
                System.out.println("Comanda no llesta!");
                break;
            case DELIVERED:
                System.out.println("Comanda entregada!");
                break;
            default:
                System.out.println("Error en la comanda!");
                break;
        }
        
    }

    private void treballarSwitch() {

        OrderStart status = OrderStart.COOKING;
        
        var result = switch (status) {
            case COOKING, ORDERED -> "Comanda no llesta!";
            case DELIVERED -> "Comanda entregada!";
            default -> "Error en la comanda";
        };

        System.out.println("Resultat de la comanda: " + result);

    }

    private void treballarSwitchYield() {

        var num = 2;

        var valor = switch (num) {
            case 1 -> {
                yield "Un";  // fa return + break;
            }
            default -> {
                yield "Dos";
            }
        };

        System.out.println("Valor retornant yield: " + valor);
    }

    private void treballarSwitchYieldExcepcio() {

        var num = 2;

        // Si es vol retornar Excepció:
        var valor = switch (num) {
            case 1 -> {
                yield "Un";
            }
            default -> throw new IllegalArgumentException("Unexpected value : " + num);
        };

        System.out.println("Valor retornant yield: " + valor);
    }

}
