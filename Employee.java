public class Employee {
    /*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    private String fullName;
    private String position;
    private String email;
    private String phone_num;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone_num, int salary, int age){
        this.age = age;
        this.salary = salary;
        this.phone_num = phone_num;
        this.email = email;
        this.position = position;
        this.fullName = fullName;
    }

    public void showEmployeeData(){
        System.out.println(" ");
        System.out.println("Full name of the employee: " + getFullName());
        System.out.println("Position: " + getPosition());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Phone number: " + getPhone_num());
        System.out.println("Salary : " + getSalary());
        System.out.println("Age: " + getAge());
    }

    public void showIfOlderThan40(){
        if (age >= 40){
            System.out.println("Full name of the employee: " + getFullName());
            System.out.println("Position: " + getPosition());
            System.out.println("E-mail: " + getEmail());
            System.out.println("Phone number: " + getPhone_num());
            System.out.println("Salary : " + getSalary());
            System.out.println("Age: " + getAge());
        }
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
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
}

