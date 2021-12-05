package CalculateUnitsApp;

public class General {

    /*
    Stwórz aplikację, która będzie służyła do przeliczania jednostek.
    Zdefiniuj klasę, która będzie posiadała metody do przeliczania jednostek metrycznych:

    metrów na centymetry
    metrów na milimetry
    centymetrów na metry
    milimetrów na metry
    W kolejnej klasie zdefiniuj metody związane z przeliczaniem czasu:

    godzin na minuty
    minut na sekundy
    sekund na milisekundy
    Zakładamy, że w przypadku jednostek czasu operujemy jedynie na wartościach całkowitych,
    czyli np. nie będziemy przeliczali "pół godziny na minuty".

    W osobnej klasie przetestuj działanie stworzonych metod.

    Korzystając ze zdefiniowanych metod przelicz np. 14 godzin na milisekundy.
     */

    public static void main(String[] args) {
        CalculateUnits calculateUnits = new CalculateUnits();
        CalculateTime calculateTime = new CalculateTime();
        double m = 2.5;
        int hours = 14;
        System.out.println(m + " metrów to " + calculateUnits.metersToCentimeters(m) + " centymetrów.");
        System.out.println(m + " metrów to " + calculateUnits.metersToMilimeters(m) + " milimetrów." + '\n');
        int minutes = calculateTime.hoursToMinutes(hours);
        int miliseconds = calculateTime.SecondsToMiliseconds(calculateTime.minutesToSeconds(minutes));
        System.out.println(hours + " godzin to " + minutes + " minut.");
        System.out.println(hours + " godzin to " + miliseconds + " milisekund.");
    }
}
