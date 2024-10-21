public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.\n");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.\n");
        }
        //Задание 2
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.\n");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.\n");
        }
        //Задание 3
        int speed = 35;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.\n");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.\n");
        }
        //Задание 4
        int аgePerson = 18;
        if (аgePerson >= 2 && аgePerson <= 6) {
            System.out.println("Если возраст человека равен " + аgePerson + " ,то ему нужно ходить в детский сад.\n");
        }
        if (аgePerson >= 7 && аgePerson <= 17) {
            System.out.println("Если возраст человека равен " + аgePerson + " ,то ему нужно ходить в школу.\n");
        }
        if (аgePerson >= 18 && аgePerson <= 24) {
            System.out.println("Если возраст человека равен " + аgePerson + " ,то ему нужно ходить в университете.\n");
        }
        if (аgePerson > 24) {
            System.out.println("Если возраст человека равен " + аgePerson + " ,то ему нужно ходить на работу.\n");
        }
        //Задание 5
        int ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе.\n");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого.Если взрослого нет, то кататься нельзя.\n");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого.\n");
        }
        //Задание 6
        int countPerson = 25;
        if (countPerson <= 102) {
            if (countPerson <= 60) {
                System.out.println("В вагоне есть сидячее место\n");
            }
            if (countPerson > 60) {
                System.out.println("В вагоне есть стоячее место\n");
            }
        } else {
            System.out.println("Вагон забит.\n");
        }
        //Задание 7
        int one = 10000;
        int two = 2000;
        int three = 300;
        if (one > two && one > three) {
            System.out.println("Значение " + one + " > " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Значение " + two + " > " + one + " и " + three);
        } else {
            System.out.println("Значение " + three + " > " + one + " и " + two);
        }
    }
}