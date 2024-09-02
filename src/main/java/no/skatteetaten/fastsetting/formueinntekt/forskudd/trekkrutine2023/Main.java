package no.skatteetaten.fastsetting.formueinntekt.forskudd.trekkrutine2023;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Skriv tabellnummer (eks. 7300) : ");
        String tabellnummer = "TABELL_" + in.nextLine();

        System.out.println("Skriv periode (eks. 1_MAANED) : ");
        String periode = "PERIODE_" + in.nextLine();

        System.out.println("Hente hele tabellen? (true/false)");
        boolean hele = in.nextBoolean();

        if (!hele) {
            System.out.println("Skriv trekkgrunnlag (eks. 50000) : ");
            long trekkgrunnlag = in.nextLong();

            var trekk = Trekkrutine.beregnTabelltrekk(
                    Tabellnummer.valueOf(tabellnummer),
                    Periode.valueOf(periode),
                    trekkgrunnlag);

            System.out.println("Regnet trekk : " + trekk);
        } else {
            var heltabell = Trekkrutine.beregnHeleTabellen(
                    Tabellnummer.valueOf(tabellnummer),
                    Periode.valueOf(periode));

            System.out.println(heltabell.alleTrekk);
        }
    }
}