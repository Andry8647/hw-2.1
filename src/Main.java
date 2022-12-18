public class Main {
    public static void main(String[] args) {
        Human max = new Human();
        max.name = "Mаксим";
        max.yearOfBirth = 1988;
        max.jobTitle = "Бренд-менеджер";
        max.town = "Минск";
         Human any = new Human();
        any.name = "Аня";
        any.yearOfBirth = 1993;
        any.jobTitle = "Методист образовательных программ";
        any.town = "Москва";
        Human katy = new Human();
        katy.name = "Катя";
        katy.yearOfBirth = 1992;
        katy.jobTitle = "Продакт-менеджер";
        katy.town = "Калининград";
        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "Директор по развитию бизнеса";
        artem.town = "Москва";



        max.printHuman();
        any.printHuman();
        katy.printHuman();
        artem.printHuman();



    }
}
