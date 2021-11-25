import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado","Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " +availableAppointment.getTime());
        }

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@mail.com");
        System.out.println(patient);

        /*Patient patient2 = new Patient("Anahí","anahi@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/
    }

    /*public enum Day {
        MONDAY("Lunes"),
        TUESDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sábado"),
        SUNDAY("Domingo");

        private String spanish;
        private Day(String s) {
            spanish = s;
        }

        private String getSpanish() {
            return spanish;
        }
    }*/
}
