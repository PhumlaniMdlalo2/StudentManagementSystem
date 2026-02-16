package za.ac.cput;

public class GraduateStudent extends Student {
    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double tuition = 90000;
        if (researchAssistant) {
            tuition = tuition - stipend;
        }
        return tuition; // Tuition cannot be negative
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: R" + stipend);
        System.out.println(" ");
    }

    // Builder Pattern Implementation
    public static class Builder {
        // Required parameters
        private String studentId;
        private String name;

        // Optional parameters
        private String email;
        private String department;
        private boolean researchAssistant = false;
        private double stipend ;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}