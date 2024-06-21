public class Intern extends Employee {
    private static final double SALARY_LIMIT = 20000.0;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("Salary exceeds the limit for interns");
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("Salary exceeds the limit for interns");
        }
        super.setSalary(salary);
    }
}

