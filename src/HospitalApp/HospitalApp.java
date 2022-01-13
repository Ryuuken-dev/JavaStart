package HospitalApp;

import java.util.Scanner;

public class HospitalApp {

    /*
    Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:

    Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL).
    Klasa powinna być zgodna z konwencją JavaBeans,
    Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta
    do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów,
    HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta,
    2 - wyświetlenie listy zapisanych pacjentów.
    Ograniczenia:

    Do szpitala może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana
    jest informacja o tym, że limit został już wyczerpany.
    Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.
     */

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        InformationSheet informationSheet = new InformationSheet();
        PatientService patientService = new PatientService(informationSheet);

        do {
            System.out.println(patientService.showAvailableOptions());
            patientService.setOption();
            switch (patientService.getOption()){
                case 1:
                    if (!patientService.checkPlaces(hospital)){
                        System.out.println("Brak miejsc!");
                        System.exit(404);
                    }
                    Patient patient = patientService.createPatient();
                    patientService.addPatient(hospital, patient);
                    break;
                case 2:
                    StringBuilder result = patientService.showPatients(hospital);
                    System.out.println(result);


            }

        }while (patientService.getOption() != 0);



    }
}
