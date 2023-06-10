// Importáljuk a package-ekbe rendezett classokat
import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Person person = new Person("Ferenc", "0001 Capitol city, Java blvd. 5.");
        Staff staff = new Staff("Mária", "0001 Capitol city, Java blvd. 6", "Progmatisch", 150);
        Student student = new Student("Ezékiel", "0001 Capitol city, Java blvd. 7", "JAVA",
                2023, 50);

        System.out.println(person);
        System.out.println(staff);
        System.out.println(student);
    }
}
