package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent.Builder("241093813", "Phumlani Mdlalo")
                .email("241093813@mycput.ac.za")
                .department("App Dev")
                .creditHours(90)
                .scholarshipAmount(18600.0)
                .build();

        GraduateStudent grad = new GraduateStudent.Builder("273094821", "Sima Mahloane")
                .email("241093813@mycput.ac.za")
                .department("Multimedia")
                .researchAssistant(true)
                .stipend(2650.0)
                .build();

        undergrad.displayStudentDetails();
        grad.displayStudentDetails();
    }
}