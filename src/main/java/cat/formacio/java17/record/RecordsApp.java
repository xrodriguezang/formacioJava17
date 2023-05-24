package cat.formacio.java17.record;

public class RecordsApp {

    // Es pot crear directament aquí.
    record Dades (String s, int i) {
        public String upper () {
            return s.toUpperCase();
        }

        /*
        És immutable, no permet fer:

        public String Setupper (String df) {
            return s = df;
        }
        */

    }

    public static void main(String[] args) {
        String a = "Hola";
        int n = 2;

        // No permet fer setters. I el getter ja no s'utilitza igual.
        var data = new Dades(a,n);

    }
}
