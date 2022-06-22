package school.lesson3;

public class Employee {
    public static void main(String[] args) {
        EmployeeMain[] employee = new EmployeeMain[5];
        employee[0] = new EmployeeMain("Ivanov Ivan Ivanovich", "Tester", "ivan@gmail.com", 1234567, 10000, 20);
        employee[1] = new EmployeeMain("Stepanov Vlad Andreevich", "Engineer", "v.step@gmail.com", 190397, 40000, 28);
        employee[2] = new EmployeeMain("Aleksin Timur Maksimovich", "Director", "aleksin@gmail.com", 5909342, 49000, 42);
        employee[3] = new EmployeeMain("Livha Svetlana Davidovna", "Teacher", "livha@gmail.com", 439340, 23100, 53);
        employee[4] = new EmployeeMain("Zvon Aleksandra Nikolaevna", "Designer", "zvon.a.n@gmail.com", 9829832, 159870, 39);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                employee[i].info();
            }
        }
    }
}
