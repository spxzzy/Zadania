import java.time.LocalDate;
import java.time.Period;

class NiepoprawnaDataException extends Exception {
    public NiepoprawnaDataException(String message) {
        super(message);
    }
}

class ZwierzakDomowy {
    private String nazwa;
    private String gatunek;
    private LocalDate dataUrodzenia;

    public ZwierzakDomowy(String nazwa, String gatunek, LocalDate dataUrodzenia) throws NiepoprawnaDataException {
        if (dataUrodzenia.isAfter(LocalDate.now()) || ObliczWiek(dataUrodzenia) > 25) {
            throw new NiepoprawnaDataException("Nieprawidłowa data urodzenia");
        }
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.dataUrodzenia = dataUrodzenia;
    }

    public int ObliczWiek(LocalDate data) {
        return Period.between(data, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        int wiek = ObliczWiek(dataUrodzenia);
        return "Zwierzak domowy:\n" +
                "Nazwa: " + nazwa + "\n" +
                "Gatunek: " + gatunek + "\n" +
                "Data urodzenia: " + dataUrodzenia + "\n" +
                "Wiek: " + wiek + " lat";
    }
}
