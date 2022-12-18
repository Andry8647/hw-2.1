public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    Human(int yearOfBirth){
        this(yearOfBirth,"Информация не указанна");
    }
    Human(int yearOfBirth,String name){
        this(yearOfBirth,name,"Информация не указанна");

    }
    Human(int yearOfBirth,String name,String town){
        this(yearOfBirth,name,town,"Информация не указанна");

    }

   Human(int yearOfBirth, String name, String town, String jobTitle){

       if(yearOfBirth>0) {
           this.yearOfBirth = yearOfBirth;
       }else {
           this.yearOfBirth = 0;
       }
       if(name!=null){
           this.name = name;
       }else {
           this.name = "Информация не указанна";
       }
       if(town!=null){
           this.town = town;
       }else {
           this.town = "Информация не указанна";
       }
       if (jobTitle!= null) {
           this.jobTitle = jobTitle;
       }else {
           this.jobTitle = "Информация не указанна";
       }


    }
    /*
    Human(int yearOfBirth,String town,String jobTitle){
        if(yearOfBirth>0) {
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = 0;
        }
        this.name = "Информация не указанна";
        this.town = town;
        this.jobTitle = jobTitle;

    }
    Human(int yearOfBirth,String name,String jobTitle){
        if(yearOfBirth>0) {
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = 0;
        }
            this.name = name;
            this.jobTitle = jobTitle;
            this.town = "Информация не указана";
        }/*




    /*Продолжим работать с классом human.

Дополните созданные ранее конструкторы проверками, которые
позволяют проверить, что год рождения не может быть отрицательным, или ставят значение по умолчанию, равное нулю.
   Если не указано имя, город проживания или должность, то есть передана пустая строка или null, то программа
    должна подставить значение «Информация не указана» при выводе в консоль.*/


    void printHuman(){
        System.out.println("Привет! Меня зовут " + name +  " Я из города " + town + " Я родился в " + yearOfBirth +  " году. " +" Я работаю на должности " + jobTitle + " Будем знакомы!");
    }
}
