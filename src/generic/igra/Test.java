package generic.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 10);
        Schoolar schoolar2 = new Schoolar("Dime", 11);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Sasha", 18);

        Employee employee1 = new Employee("Slava", 390);
        Employee employee2 = new Employee("Egor", 391);

        Team<Schoolar> schoolTeam = new Team<>("Drakoni");
        Team<Student> studentTeam = new Team<>("Drakoni1");
        Team<Employee> employeeTeam = new Team<>("Drakoni2");
        schoolTeam.addNewParticipant(schoolar1);
        schoolTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Mudrezi");
        Schoolar schoolar3 = new Schoolar("Sergey", 14);
        Schoolar schoolar4 = new Schoolar("Alexy", 15);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolTeam.playWith(schoolarTeam2);


    }
}
