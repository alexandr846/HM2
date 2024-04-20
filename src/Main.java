public class Main {
    public static void main(String[] args) {
                System.out.println("Hello world!");
                var dog = 8.0 ;
                System.out.println(dog);
                var cat = 3.6 ;
                System.out.println(cat);
                var paper = 763789 ;
                System.out.println(paper);


                dog = dog + 4 ;
                System.out.println("dog = " + dog);
                cat = cat + 4 ;
        System.out.println("cat = " + cat);
        paper = paper +4 ;
        System.out.println("paper = " + paper);

        dog = dog - 3.6 ;
        System.out.println("dog = " + dog);
        cat = cat - 1.6 ;
        System.out.println("cat = " + cat);
        paper = paper - 7639 ;
        System.out.println("paper = " + paper);

        var friend = 19 ;
        System.out.println("friend = " + friend);
        friend = friend + 2 ;
        System.out.println("friend = " + friend);
        friend = friend / 7 ;
        System.out.println("friend = " + friend);

        var frog = 3.5 ;
        System.out.println("frog = " + frog);
        frog = frog * 10 ;
        System.out.println("frog = " + frog);
        frog = frog / 3.5 ;
        System.out.println("frog = " + frog);
        frog = frog + 4 ;
        System.out.println("frog = " + frog);

        var boxerOne = 78.2 ;
        var boxerTwo = 82.7 ;
        var result = 78.2 + 82.7 ;
        System.out.println("boxerOne +  boxerTwo= " + result );
        var totalWeight = boxerTwo % boxerOne ;
        System.out.println(" Разница в весе между боксерами " + totalWeight + "кг");


        var totalTime = 640 ;
        var individualTime = 8 ;
        var hardWorkers = totalTime / individualTime ;
        System.out.println("Всего трудяг в компании " + hardWorkers + "людей");
        var hardWorkersCompany = hardWorkers + 94 ;
        System.out.println("Если в компании работает" + hardWorkersCompany+ "человека, то всего" + (hardWorkersCompany * 8) + "часов работы может быть поделено между сотрудниками") ;











    }
}