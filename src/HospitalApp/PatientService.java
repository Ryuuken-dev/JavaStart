package HospitalApp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PatientService {

    Scanner scanner = new Scanner(System.in);
    InformationSheet informationSheet;
    private byte option;
    String pesel;

    public PatientService(InformationSheet informationSheet){

        this.informationSheet = informationSheet;
    }


    public String showAvailableOptions(){
        return "1 - dopisanie pacjenta do kolejki" + '\n' +
                "2 - wyświetlenie listy zapisanych pacjentów" + '\n' +
                "0 - wyjście z programu" + '\n' +
                "Wybierz opcję:";
    }

    public boolean checkPlaces(Hospital hospital){
        return hospital.getPlaces() > 0;
    }

    public void setOption() {
        this.option = scanner.nextByte();
    }

    public byte getOption() {
        return option;
    }

    private boolean validatePesel(String pesel){

        int resultOfDivision = 0;
        byte divisor;
        char[] peselNumbers = pesel.toCharArray();
        if (peselNumbers.length != 11){
            return false;
        }
        for (int i = 0; i < peselNumbers.length-1; i++) {
            if (i == 0 || i == 4 || i == 8){
                divisor = 1;
            } else if (i == 1 || i == 5 || i == 9){
                divisor = 3;
            } else if (i == 2 || i == 6){
                divisor = 7;
            } else {
                divisor = 9;
            }
            int number = Integer.parseInt(String.valueOf(peselNumbers[i]));
            resultOfDivision += number*divisor;
        }
        char[] resultNumbers = Integer.toString(resultOfDivision).toCharArray();
        byte finalResult = (byte) (10-Byte.parseByte(String.valueOf(resultNumbers[resultNumbers.length-1])));
        byte lastPeselNumber = Byte.parseByte(String.valueOf(peselNumbers[peselNumbers.length-1]));
        return finalResult == lastPeselNumber;

    }

    public Patient createPatient(){

        scanner.nextLine();
        System.out.print(informationSheet.getNameInfo());
        String name = scanner.nextLine();
        System.out.print(informationSheet.getSurnameInfo());
        String surname = scanner.nextLine();
        do {
            System.out.print(informationSheet.getPeselInfo());
            pesel = scanner.nextLine();
        } while (!validatePesel(pesel));

        return new Patient(name, surname, pesel);
    }

    public void addPatient(Hospital hospital, Patient patient){

        hospital.getPatients()[hospital.getPosition()] = patient;
        hospital.setPosition();
        hospital.decreasePlacesNumber();
    }

    public StringBuilder showPatients(Hospital hospital){

        StringBuilder result = new StringBuilder();
        for (Object el:
                hospital.getPatients()) {
            if (el != null){
                result.append(el).append('\n');
            }
        }
        return result;
    }
}
