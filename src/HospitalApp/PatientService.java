package HospitalApp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PatientService {

    InformationSheet informationSheet;
    private byte option;

    public PatientService(InformationSheet informationSheet){

        this.informationSheet = informationSheet;
    }

    Scanner scanner = new Scanner(System.in);

    public String showAvailableOptions(){
        return "1 - dopisanie pacjenta do kolejki" + '\n' +
                "2 - wyświetlenie listy zapisanych pacjentów" + '\n' +
                "0 - wyjście z programu" + '\n' +
                "Wybierz opcję:";
    }

    public boolean checkPlaces(Hospital hospital){
        return hospital.getPlaces() > 0;
    }

    public void setOption() { this.option = scanner.nextByte(); }

    public byte getOption() {
        return option;
    }

    private boolean validatePesel(String pesel){

        int result = 0;
        byte divisor = 0;
        char[] peselNumbers = pesel.toCharArray();
        if (peselNumbers.length != 11){
            return false;
        }
        for (int i = 0; i < peselNumbers.length; i++) {
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
            result += number*divisor;
        }
        char[] resultNumbers = Integer.toString(result).toCharArray();
        if (resultNumbers[resultNumbers.length-1] == peselNumbers[peselNumbers.length-1]){
            return true;
        }
        return false;

    }

    public Patient createPatient(){

        scanner.nextLine();
        System.out.print(informationSheet.getNameInfo());
        String name = scanner.nextLine();
        System.out.print(informationSheet.getSurnameInfo());
        String surname = scanner.nextLine();
        System.out.print(informationSheet.getPeselInfo());
        String pesel = scanner.nextLine();
        return new Patient(name, surname, pesel);
    }

    public void addPatient(Hospital hospital, Patient patient){

        hospital.getPatients()[hospital.getPosition()] = patient;
        hospital.setPosition();
        hospital.setPlaces();
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
