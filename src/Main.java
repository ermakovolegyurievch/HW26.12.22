public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов,можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов,нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 7;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int fullPlace = 102;
        int fullSitPlace = 60;
        int fullStayPlace = fullPlace - fullSitPlace;
        int sit = 30;
        int stay = 40;
        int place = sit + stay;
        if (place < fullPlace && sit < fullSitPlace) {
            System.out.println("В вагоне есть сидячее место.");
        } else if (place < fullPlace && stay < fullStayPlace) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("Вагон забит.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 3;
        int two = 4;
        int three = 2;
        if (one > two) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}
