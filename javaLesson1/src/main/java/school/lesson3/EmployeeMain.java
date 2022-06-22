package school.lesson3;

public class EmployeeMain {
    private String name;
    private String position;
    private String email;
    private int telephoneNumber;
    private int salary;
    private int age;

    public EmployeeMain(String name, String position, String email, int telephoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this. salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void info() {
        System.out.println("ФИО: " + name + " Должность: "+ position + " Email: "+email+" Номер телефона: "+telephoneNumber+" Должность: "+salary+" Возраст: "+age);
    }
}
