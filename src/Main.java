public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        var dog = 6;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задание 3
        System.out.println("Задание 3");
        var dog1 = 3.5;
        var cat1 = 1.6;
        var paper1 = 7640;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat1 = cat1 - 1.6;
        System.out.println(cat1);
        paper1 = paper1 - 7639;
        System.out.println(paper1);

        //Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("friend1 = " + friend);
        friend = friend + 2;
        System.out.println("friend2 = " + friend);
        friend = friend / 7;
        System.out.println("friend3 = " + friend);

        //Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog1 = " + frog);
        frog = frog * 10;
        System.out.println("frog2 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog3 = " + frog);
        frog = frog + 4;
        System.out.println("frog4 = " + frog);


        // Задание 6
        System.out.println("Задание 6");
        var FirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        var TotalWeight = FirstBoxer + SecondBoxer;
        System.out.println("Общий вес боксеров = " + TotalWeight);
        var difference = SecondBoxer - FirstBoxer;
        System.out.println("Разница = " + difference);

        //Задание 7
        System.out.println("Задание 7");
        difference = SecondBoxer - FirstBoxer;
        System.out.println("Разница = " + difference);
        difference = SecondBoxer % FirstBoxer;
        System.out.println("Разница = " + difference);

        // Задание 8
        System.out.println("Задание 8");
        var TotalHours = 640;
        var WorkHours = 8;
        var TotalPeople = TotalHours / WorkHours;
        System.out.println("Всего работников в компании " + TotalPeople + " человек");
        TotalPeople = TotalPeople + 94;
        TotalHours = WorkHours * TotalPeople;
        System.out.println("Если в компании работает " +  TotalPeople +
                " человек, то всего " + TotalHours +" часов работы может быть поделено между сотрудниками");

    }
}