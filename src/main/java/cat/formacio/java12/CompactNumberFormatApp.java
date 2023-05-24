package cat.formacio.java12;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatApp {

    public static void main(String[] args) {

        CompactNumberFormatApp compactNumberFormatApp = new CompactNumberFormatApp();
        compactNumberFormatApp.imprimirNumero();
    }

    private void imprimirNumero() {

        NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println(format.format(1000));
        System.out.println(format.format(1_000_000_000));

        NumberFormat format2 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println(format2.format(1000));
        System.out.println(format2.format(1_000_000_000));

        format2.setRoundingMode(RoundingMode.DOWN);
        format2.setMaximumFractionDigits(2);
        System.out.println(format2.format(130_501_000));

    }
}
