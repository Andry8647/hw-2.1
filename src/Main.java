public class Main {
    public static void main(String[] args) {
        Human max = new Human(1988,null, "Минск", "Бренд-менеджер");
        Human any = new Human(1993, "Аня", null, "Методист образовательных программ");
        Human katy = new Human(1992, "Катя","Калининград", null);
        Human artem = new Human(1995, null, null, null);



        max.printHuman();
        any.printHuman();
        katy.printHuman();
        artem.printHuman();



    }
}
