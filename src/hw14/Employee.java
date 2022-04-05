package hw14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

// Создать список объектов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании
public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // TODO: конструктор, геттеры и сеттеры

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний


        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            int nameRandomIndex = (int) (Math.random() * names.length);
            int companyRandomIndex = (int) (Math.random() * companies.length);
            int ageRandom = (int) (21 + Math.random() * 61);
            int salaryRandom = (int) (2 + Math.random());
            // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
            employees.add(new Employee(names[nameRandomIndex], companies[companyRandomIndex], ageRandom, salaryRandom));
        }
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    static class AgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CompanyComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getCompany().compareTo(o2.getCompany());
        }
    }

    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o1.getSalary(), o2.getSalary());
        }
    }



    public static void main(String[] args) {
        List<Employee> list = employeeGenerator(6);
        System.out.println(list);

        Comparator<Employee> employeeComparator = new NameComparator();
        TreeSet<Employee> treeSet = new TreeSet<>(employeeComparator);
        treeSet.addAll(list);
        System.out.println(treeSet);

        Comparator<Employee> employeeComparator1 = new NameComparator().thenComparing(new SalaryComparator());
        TreeSet<Employee> treeSet1 = new TreeSet<>(employeeComparator1);
        treeSet1.addAll(list);
        System.out.println(treeSet1);

        Comparator<Employee> employeeComparator2 = new NameComparator().thenComparing(new SalaryComparator().thenComparing(new AgeComparator()));
        TreeSet<Employee> treeSet2 = new TreeSet<>(employeeComparator2);
        treeSet1.addAll(list);
        System.out.println(treeSet2);

        Comparator<Employee> employeeComparator3 = new NameComparator().thenComparing(new SalaryComparator().thenComparing(new AgeComparator().thenComparing(new
                CompanyComparator())));
        TreeSet<Employee> treeSet3 = new TreeSet<>(employeeComparator3);
        treeSet1.addAll(list);
        System.out.println(treeSet3);
    }
}
