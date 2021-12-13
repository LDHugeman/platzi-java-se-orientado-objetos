import Model.*;

import java.util.Date;

public class Pruebas {
    /*
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahí Salgado","anahi@anahi.com");
        myDoctor.addAvailableAppointment("13/12/2021", "4pm");
        myDoctor.addAvailableAppointment("13/12/2021","10am");
        myDoctor.addAvailableAppointment("13/12/2021","1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPatient = new Patient("Anahi", "ana@ana.com");
        userPatient.showDataUser();

        User user1 = new User("Anahi", "ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor \n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor();
        iSchedulable1.schedule(new Date(), "4pm");

        for (Model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " +availableAppointment.getTime());
        }

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@mail.com");
        System.out.println(patient);

        Model.Patient patient2 = new Model.Patient("Anahí","anahi@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
    }

    public enum Day {
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
    }

    */
}
