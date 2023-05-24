package cat.formacio.java17;

public class TextBlocksApp {

    public static void main(String[] args) {

        TextBlocksApp textBlocksApp = new TextBlocksApp();

        textBlocksApp.textBlock();

    }

    /**
     * Prova de TextBlock
     *
     * Info: https://blogs.oracle.com/javamagazine/post/text-blocks-come-to-java
     */
    private void textBlock() {

        var paraula = "paraulaAfegida";

        var fraseBlock = """
            Això es un prova
            de com es pot fer una query
            sense posar tantes +++++
            """;

        System.out.println("FraseBlock: " + fraseBlock);

        var fraseInterpolacio = """
            {
                "nom": "%s",
                "cognoms: "%s"
            }
            """.formatted(paraula, paraula);

        System.out.println("FraseFormatejada: " + fraseInterpolacio);

        String data = """
                Aixo es una unica frase pero
                la escric aixi pe tal
                que es llegeixi millor
                """;

        System.out.println("Data: " + data);

        String dataSenseReturns = """
                Aixo es una unica frase pero \
                la escric aixi pe tal \
                que es llegeixi millor \
                """;

        System.out.println("DataSenseReturns: " + dataSenseReturns);
    }
}