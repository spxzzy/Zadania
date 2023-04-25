import java.time.LocalDate;
public class Program {
    public static void main(String[] args) {
        try {
            ZwierzakDomowy zwierzak = new ZwierzakDomowy("Reksio", "Pies", LocalDate.of(2015, 4, 15));
            System.out.println(zwierzak.toString());
        } catch (NiepoprawnaDataException e) {
            LocalDate dataUrodzenia = LocalDate.now();
            try {
                ZwierzakDomowy zwierzak = new ZwierzakDomowy("Reksio", "Pies", dataUrodzenia);
                System.out.println(zwierzak.toString());
            } catch (NiepoprawnaDataException ex) {
                ex.printStackTrace();
            }
        }
    }
}