public class Main {
    public static void main(String[] args) {
        task1();
    }
    private static void task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +  firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
}