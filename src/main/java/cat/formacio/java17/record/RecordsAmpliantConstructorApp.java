package cat.formacio.java17.record;

public class RecordsAmpliantConstructorApp {

    // Es pot crear directament aquí.
    record Dades (String s, int i) {

        // S'afegeix un constructor
        public Dades (String a) {
            this(a, 0);
        }
        public String upper () {
            return s.toUpperCase();
        }

    }

    public static void main(String[] args) {
        String a = "Hola";
        int n = 2;

        // No permet fer setters. I el getter ja no s'utilitza igual.
        var data = new Dades(a,n);

    }
}
