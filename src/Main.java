public class Main {
    public static void main(String[] args) {
        // Exercise 1
        byte a = 1;
        short b = 167;
        int c = 135654;
        long d = 174453245245L;
        float e = 1.45f;
        double f = 1.36537344;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
        // Exercise 2
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        short j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;
        System.out.println("Значение переменной с типом float равно " + g);
        System.out.println("Значение переменной с типом long равно " + h);
        System.out.println("Значение переменной с типом double равно " + i);
        System.out.println("Значение переменной с типом short равно " + j);
        System.out.println("Значение переменной с типом short равно " + k);
        System.out.println("Значение переменной с типом int равно " + l);
        System.out.println("Значение переменной с типом byte равно " + m);
        // Exercise 3
        int firstTeacher = 23;
        int secondTeacher = 27;
        int thirdTeacher = 30;
        int paper = 480;
        System.out.println("На каждого ученика расчитано " + paper / (firstTeacher +
                secondTeacher + thirdTeacher) + " листов бумаги");
        // Exercise 4
        int productivity = 16 / 2;
        int twentyMinutesProductivity = productivity * 20;
        int dayProductivity = productivity * 60 * 24;
        int threeDaysProductivity = dayProductivity * 3;
        int monthProductivity = dayProductivity * 31;
        System.out.println("За 20 минут машина произвела " + twentyMinutesProductivity + " штук бутылок");
        System.out.println("За сутки минут машина произвела " + dayProductivity + " штук бутылок");
        System.out.println("За 3 дня минут машина произвела " + threeDaysProductivity + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + monthProductivity + " штук бутылок");
        // Exercise 5
        int allPaintCans = 120;
        int countOfClasses = allPaintCans / (4 + 2);
        int countOfWhiteCans = countOfClasses * 2;
        int countOfBrownCans = countOfClasses * 4;
        System.out.println("В школе где " + countOfClasses + " классов нужно " + countOfWhiteCans +
                " банок белой краски и " + countOfBrownCans + " банок коричневой краски");
        // Exercise 6
        int banana = 80; // g
        float milk = 1.05f; // g
        int iceCream = 100;
        int egg = 70;
        float resultGrams = 5 * banana + 200 * milk +  2 * iceCream + 4 * egg;
        float resultKilograms = resultGrams / 1000;
        System.out.println("Вес завтрака: " + resultGrams + " грамм и "
        + resultKilograms + " килограмм.");
        // Exercise 7
        int weightInKilograms = 7; // kg
        int weightInGrams = weightInKilograms * 1000;
        int dayOfFirstDiet = weightInGrams / 250;
        int dayOfSecondDiet = weightInGrams / 500;
        int averageCountDietDays = ( dayOfFirstDiet + dayOfSecondDiet ) / 2;
        System.out.println("Если спортсмен каждый день будет терять 250 грамм, то на " +
                "похудение уйдет " + dayOfFirstDiet + " дней");
        System.out.println("Если спортсмен каждый день будет терять 500 грамм, то на " +
                "похудение уйдет " + dayOfSecondDiet + " дней");
        System.out.println("В среднем, чтобы добиться результата похудения, " +
                "необходим " + averageCountDietDays + " день");
        // Exercise 8
        float cheapMashaSalary = 67760f;
        float cheapDennisSalary = 83690f;
        float cheapCristinaSalary = 76230f;
        float richMashaSalary = cheapMashaSalary * 1.1f;
        float richDennisSalary = cheapDennisSalary * 1.1f;
        float richCristinaSalary = cheapCristinaSalary * 1.1f;
        float increaseMashaSalary = (richMashaSalary * 12f) - (cheapMashaSalary * 12f);
        float increaseDennisSalary = (richDennisSalary * 12f) - (cheapDennisSalary * 12f);
        float increaseCristinaSalary = (richCristinaSalary * 12f) - (cheapCristinaSalary * 12f);
        System.out.println("Маша теперь получает " + richMashaSalary + " рублей" +
                " годовой доход вырос на " + increaseMashaSalary + " рублей");
        System.out.println("Деннис теперь получает " + richDennisSalary + " рублей" +
                " годовой доход вырос на " + increaseDennisSalary + " рублей");
        System.out.println("Кристина теперь получает " + richCristinaSalary + " рублей" +
                " годовой доход вырос на " + increaseCristinaSalary + " рублей");


    }
}