import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado","Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@mail.com");
        Patient patient2 = new Patient("Anahí","anahi@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
       /* patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/
    }
}
