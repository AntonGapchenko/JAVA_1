package homework_4;

public class Employee {
    private static int count=1;
    private int id;
    private String name;
    private String position;
    private String phoneNumber;
    private int salary;

    private int age;

    public Employee( String name, String position, String phoneNumber, int salary, int age) {

        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.id=count++;
    }

    public void printInfo(){
        System.out.println("ID:"+ id+" "+"ФИО:"+ name+" Должность:"+ position+" Номер телефона:"+ phoneNumber+" Зарплата:"+ salary+" Возраст:"+age);
    }


    public void raiseSalary(){
       int bonus=10000;
       if (age>35)
       salary+=bonus;

   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


}


