import java.util.Comparator;

public class Employee123 implements Comparable<Employee123>{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee123(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee123{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee123 another) {
//        if (this.id == another.id) {
//            return 0;
//        }
//        else if (this.id > another.id){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
//        return this.id - another.id;
    //    return this.id.compareTo(another.id);
        int res = this.name.compareTo(another.name);
        if (res==0){
            res = this.surname.compareTo(another.surname);
        }

        return res;
    }
}

class IdComparator implements Comparator<Employee123>{
    @Override
    public int compare(Employee123 emp1, Employee123 emp2) {
        if (emp1.id > emp2.id){
            return 1;
        }
        else if (emp1.id<emp2.id){
            return -1;
        }
        else {
            return 0;
        }
    }
}

class NameComparator implements Comparator<Employee123>{
    @Override
    public int compare(Employee123 emp1, Employee123 emp2){
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee123>{
    @Override
    public int compare(Employee123 emp1, Employee123 emp2){
        return emp1.salary - emp2.salary;
    }
}
