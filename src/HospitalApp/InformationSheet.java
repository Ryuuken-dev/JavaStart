package HospitalApp;

public class InformationSheet {

    private final String nameInfo = "Podaj imię:" + '\n';
    private final String surnameInfo = "Podaj nazwisko:" + '\n';
    private final String peselInfo = "Podaj numer PESEL:" + '\n';

    public String getNameInfo() {
        return nameInfo;
    }

    public String getSurnameInfo() {
        return surnameInfo;
    }

    public String getPeselInfo() {
        return peselInfo;
    }
}
