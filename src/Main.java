public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var boxerWeight1 = 78.2;
        System.out.println(boxerWeight1);
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2);
        var generalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(generalWeight);
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println(differenceWeight);
        var differenceWeight2 = boxerWeight2 % boxerWeight1;
        System.out.println(differenceWeight2);

        var generalHours = 640;
        System.out.println(generalHours);
        var hoursWorker = 8;
        System.out.println(hoursWorker);
        var generalWorkers = generalHours / hoursWorker;
        System.out.println("Всего работников в компании " + generalWorkers);

        generalWorkers = generalWorkers + 94;
        System.out.println(generalWorkers);

        var generalHours2 = generalWorkers * hoursWorker;
        System.out.println("Если в компании работает " + generalWorkers + " человек, то всего " + generalHours2 + " часов работы может быть поделено между сотрудниками");





    }
}