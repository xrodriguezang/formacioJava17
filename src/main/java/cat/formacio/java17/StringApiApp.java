package cat.formacio.java17;

import java.util.List;
import java.util.stream.Collectors;

public class StringApiApp {

    public static void main(String[] args) {
        StringApiApp stringApiApp = new StringApiApp();
        stringApiApp.identar();
        stringApiApp.transformar();

    }

    private void identar () {
        var frase = "Aquesta es una frase\n"
            + "de prova\n"
            + "que ja acaba";

        System.out.println(frase.indent(4));
    }

    private void transformar () {
        var fraseTransformar = "Hola que tal estas?";

        // Manera tradicional
        // var resultTradicional = capitalCase(dropPrimeraParaula(fraseTransformar)).concat("...");

        var resultTransform = fraseTransformar
                .transform(StringApiApp::dropPrimeraParaula2)
                .transform(StringApiApp::capitalCase)
                .concat("...");

        System.out.println("Resultat de la frase transformada: " + resultTransform);
    }

    private static String capitalCase(String fraseTransformar) {
        return List.of(fraseTransformar.split("\\W+"))
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    /**
     * Mine
     * @param fraseTransformar
     * @return
     */
    private static String dropPrimeraParaula1(String fraseTransformar) {
        // https://stackoverflow.com/questions/9378394/remove-first-word-from-a-string-in-java
        return fraseTransformar.split(" ", 2)[1];
    }

    /**
     * Fet pel professor
     *
     * @param fraseTransformar
     * @return
     */
    private static String dropPrimeraParaula2(String fraseTransformar) {
        return List.of(fraseTransformar.split("\\W+"))
                .stream()
                .skip(1)
                .collect(Collectors.joining(" "));
    }

}
