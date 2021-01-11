public class Main {
    public static void main(String[] args) {
        Employee employee0 = new Employee(
                "Klimentev Danil Dmitrievich",
                "Java developer",
                "danil.klimentev@mail.ru",
                "+79126697218",
                1000,
                25){

        };

        Employee employeesArray[] = new Employee[5];
       employeesArray[0] = new Employee("Putin Vladimir Vladimirovich",
               "president",
               "russia@no.1",
               "+7-XXXXXXXXXX",
               999999999,
               68);
       employeesArray[1] = new Employee("Mishustin Mikhail Vladimirovich",
                "predsedatel pravitelstva",
                "russia@no.2",
                "+7-XXXXXXXXXY",
                99999999,
                54);
       employeesArray[2] = new Employee("Peskov Dmitriy Sergeevich",
                "press sekretar' presidenta",
                "russia@office.ru",
                "+7-XXXXXXXyyyy",
                99999999,
                53);
       employeesArray[3] = new Employee("Medvedev Dmitriy Anatolievich",
                "zamestitel'predsedatelya soveta bezopasnosti RF",
                "russia@vechno.vtoroy",
                "+7-XXXSHDIFSHIHD",
                99999999,
                55);
       employeesArray[4] = new Employee("Zhirinovsky Vladimir Volfovich",
                "LDPR no.1",
                "ldpr@no.1",
                "+7-XXXX248745XX",
                9999990,
                74);

       for(int i = 0; i < employeesArray.length; i++) {
           if (employeesArray[i].getAge() >= 40) {
               employeesArray[i].showEmployeeData();
           }
       }
    }

}
