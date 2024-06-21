import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create Employee objects
        employees.add(new Employee("Goldylocks", "goldylocks@example.com", 30, 50000));
        employees.add(new Employee("PapaBear", "papabear1@example.com", 25, 45000));
        employees.add(new Employee("MamaBear", "mamabear@example.com", 28, 48000));
        employees.add(new Employee("BabyBear", "babybear@example.com", 35, 52000));
        employees.add(new Employee("Leonardo", "leonardo@example.com", 22, 43000));
        employees.add(new Employee("Michelangelo", "michelangelo@example.com", 31, 47000));
        employees.add(new Employee("Raphael", "raphael@example.com", 27, 46000));
        employees.add(new Employee("Donatello", "donatello@example.com", 29, 49000));
        employees.add(new Employee("Jack", "jack@example.com", 26, 44000));
        employees.add(new Employee("Jill", "jill@example.com", 32, 51000));

        // Write employee information to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                writer.println(employee);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

