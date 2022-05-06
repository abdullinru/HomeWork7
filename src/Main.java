public class Main {
    public static void main(String[] args) {
//        task1();
//        task3();
//        task5();
        task6();
    }
    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] fullNaneChar = fullName.toCharArray();
        int indexFam = fullName.indexOf(" ");
        int name = fullName.lastIndexOf(" ");
        fullNaneChar[0] = Character.toUpperCase(fullNaneChar[0]);
        for (int i = 0; i < fullNaneChar.length; i++) {
            if (fullNaneChar[i]==' ') {
                fullNaneChar[i + 1] = Character.toUpperCase(fullNaneChar[i + 1]);
            }
        }
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        System.out.println(fullNaneChar);

    }
    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";

        int indexFam = fullName.indexOf(" ");
        int name = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(0,indexFam);
        String middleName = fullName.substring(indexFam+1,name);
        String lastName = fullName.substring(name+1);
        System.out.println("Фамилия сотрудника - " + firstName);
        System.out.println("Имя сотрудника - " + middleName);
        System.out.println("Отчество сотрудника - " + lastName);

    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));

    }
    private static void task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +  firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
}