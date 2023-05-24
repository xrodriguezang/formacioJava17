package cat.formacio.java17;

public class InstanceOfApp {

    public static void main(String[] args) {
        InstanceOfApp instanceOfApp = new InstanceOfApp();

        instanceOfApp.provaInstaceOf();


    }

    private void provaInstaceOf() {

        Object object = 10;

        System.out.println("Classe: "  + object.getClass().getName());

        Integer s;
        if (object instanceof Integer) {  // Si és un integer, assinga a i.
            s = (Integer) object;
        }


        if (object instanceof Integer i) {  // Si és un integer, assinga a i.
            System.out.println("Integer: " + i);
        }

        Object object2 = "AAA";

        if (object2 instanceof String i) {  // Si és un integer, assinga a i.
            System.out.println("String: " + i);
        }

        Object object3 = "BB";

        // Entra només si té 2 o menys de mida
        if (object3 instanceof String i && i.length() <=2) {  // Si és un integer, assinga a i.
            System.out.println("String menor que 2: " + i);
        }

        Object object4 = "Aquest no s'ha d'imprimir!";

        // Entra només si té 2 o menys de mida
        if (object4 instanceof String i && i.length() <=2) {  // Si és un integer, assinga a i.
            System.out.println("String menor que 2: " + i);
        }

    }
}
