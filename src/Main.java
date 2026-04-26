import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        int luck = 273;
        System.out.println("Значение переменной  luck с типом int равно " + luck);
        byte rang = 10;
        System.out.println("Значение переменной  rang с типом byte равно " + rang);
        short yuo = 30052;
        System.out.println("Значение переменной  you с типом short равно " + yuo);
        long duo = 90019838;
        System.out.println("Значение переменной  duo с типом long равно " + duo);
        float raf = 2.312F;
        System.out.println("Значение переменной  raf с типом float равно " + raf);
        double hub = 1.00000011;
        System.out.println("Значение переменной  hub с типом double равно " + hub);


        float bin = 27.12F;
        System.out.println("Значение переменной  bin с типом float равно " + bin);
        long catBin = 987678965;
        System.out.println("Значение переменной  catBin с типом long равно " + catBin);
        BigInteger qin = new BigInteger("987678965549");
        System.out.println("Значение переменной  qin с типом BigInteger равно " + qin);
        double b = 2.786;
        System.out.println("Значение переменной  b с типом double равно " + b);
        int a = 569;
        System.out.println("Значение переменной  a с типом int равно " + a);
        int f = -159;
        System.out.println("Значение переменной  f с типом int равно " + f);
        short s = 27897;
        System.out.println("Значение переменной  s с типом short равно " + s);
        byte l = 67;
        System.out.println("Значение переменной  l с типом byte равно " + l);


        int lP = 23;
        int aS = 27;
        int eA = 30;
        int all = lP + aS + eA;
        int o = 480 / all;
        System.out.println("На каждого ученика рассчитано " + o + " листов бумаги");


        byte bottle = 16;
        byte time = 2;
        int bottle2 = bottle/time * 20;
        System.out.println("за 20 минут машина произвела  " + bottle2 + "  штук бутылок");

        int bottle3 = bottle * 720;
        System.out.println("за сутки машина произвела  " + bottle3 + "  штук бутылок");

        int bottle4 = bottle3 * 3;
        System.out.println("за 3 суткок машина произвела  " + bottle4 + "  штук бутылок");

        int bottle5 = bottle3 * 30;
        System.out.println("За месяц машина произвела  " + bottle5 + "  штук бутылок");


        byte allMask = 120;
        byte white1 = 2;
        byte brown1 = 4;
        int oneclass = white1 + brown1;
        int classes = allMask / oneclass;
        System.out.println("в школе " + classes + " классов");
        int white2 = white1 * classes;
        int brown2 = brown1 * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + white2 + " банок белой краски и " + brown2 + " банок коричневой краски");


        byte bananaWeight = 80;
        byte bananas = 5;
        byte milksWeight = 105 / 100;
        int milk = 200;
        byte icecreamWeight = 100;
        byte icecream = 2;
        byte eggWeight = 70;
        byte egg = 4;
        int breackfast = bananas * bananaWeight + milk * milksWeight + icecream * icecreamWeight + egg * eggWeight;
        float breackfastkg = breackfast / 1000f;
        System.out.println("Вес завтрака " + breackfast + " грамм и " + breackfastkg + " килограмм");


        int day1m = 250;
        int weight = 7 * 1000;
        int firstWeight = weight / day1m;
        System.out.println("При потере в день 250 грамм уйдет " + firstWeight + " дней");
        int day2m = 500;
        int twoWeight = weight / day2m;
        System.out.println("При потере в день 500 грамм уйдет " + twoWeight + " дней");


        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        float percent = 0.10F;
        float newMasha = masha + masha * percent;
        float newDenis = denis + denis * percent;
        float newKris = kris + kris * percent;
        int mashaYear = masha * 12;
        float mashaYear1 = newMasha * 12;
        float mashaDif = mashaYear1 - mashaYear;
        int denYear = denis * 12;
        float denYear1 = newDenis * 12;
        float denDif = denYear1 - denYear;
        int krisYear = kris * 12;
        float krisYear1 = newKris * 12;
        float krisDif = krisYear1 - krisYear;

        System.out.println("Маша теперь получает " + newMasha + " рублей, годовой доход вырос на " + mashaDif + " рублей");

        System.out.println("Денис теперь получает " + newDenis + " рублей, годовой доход вырос на " + denDif + " рублей");
        System.out.println("Кристина теперь получает " + newKris + " рублей, годовой доход вырос на " + krisDif + " рублей");
    }
}
