public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of Strings!");


        //task1
        String firstName = "Степан";
        String middleName = "Алексеевич";
        String lastName = "Дегтярев";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О.сотрудника-" + fullName);
        System.out.println("***end of the task 1*** ");

        //task 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О.сотрудника для заполнения отчёта-" + upperFullName);
        System.out.println("***end of the task 2*** ");

        //task3
        fullName = "Ёжиков Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные Ф.И.О.сотрудника-" + fullName);
        System.out.println("***end of the task 3*** ");
        System.out.println("***end homework*** ");


    }
}