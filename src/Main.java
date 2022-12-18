public class Main {
    public static void main(String[] args) {
        Human max = new Human(1988, "Максим", "Минск", "Бренд-менеджер");
        Human any = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human katy = new Human(1992, "Катя","Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");



        max.printHuman();
        any.printHuman();
        katy.printHuman();
        artem.printHuman();



    }
}
