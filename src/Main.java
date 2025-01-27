public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte cars = 127;
        int drivers = 547;
        short people = 12354;
        long mice = 129576348L;
        float food = 275.4573F;
        double water = 257.369871254;
        System.out.println("Значение переменной cars с типом byte равно " + cars);
        System.out.println("Значение переменной drivers с типом int равно " + drivers);
        System.out.println("Значение переменной people с типом short равно " + people);
        System.out.println("Значение переменной mice с типом long равно " + mice);
        System.out.println("Значение переменной food с типом float равно " + food);
        System.out.println("Значение переменной water с типом double равно " + water);

        float number1 = 27.12F;
        long number2 = 987678965549L;
        float number33 = 2.786F;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7= 67;

        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short paper = 480;
        int paper4One = paper/(luda+anna+katya);
        System.out.println("На каждого ученика рассчитано " + paper4One + " листов бумаги");

        byte machine = 16/2;
        short minute = 20;
        short day = 1440;
        short days = (short) (day*3);
        int month = day*30;

        int cycle1 = machine*minute;
        int cycle2 = machine*day;
        int cycle3 = machine*days;
        int cycle = machine*month;

        System.out.println("За 20 минут машина произвела "+ cycle1 +" штук бутылок");
        System.out.println("За сутки машина произвела "+ cycle2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + cycle3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + cycle + " штук бутылок");

        int colors = 120;
        int whiteInClass = 2;
        int brownInClass = 4;
        int klass = colors/whiteInClass+brownInClass;
        int wht4Class = klass*whiteInClass;
        int brw4Class = klass*brownInClass;

        System.out.println("В школе где "+ klass +" классов, нужно "+ wht4Class +" банок белой краски и "+ brw4Class +" банок коричневой краски");

        float banana = 0.08F;
        float milk = 0.105F;
        float iceCream = 0.1F;
        float egg = 0.07F;

        float milkSheak = (banana*5) + (milk*2) + (iceCream*2) + (egg*4);
        int breakfast = (int) ((banana*5) + (milk*2) + (iceCream*2) + (egg*4));
        System.out.println("Всегов в питательном завтраке "+ milkSheak +" грамм, или " + breakfast+ " кг.");

        float min = 7/0.25F;
        float max = 7/0.5F;
        int middle = (int) (max+min/2);

        System.out.println(min + "дней уйдет если худеть на 250 грамм, " + max + " если худеть 500 грамм в день и " + middle +" в среднем");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int zpMasha = (int) (masha*1.1);
        int zpDenis = (int) (denis*1.1);
        int zpKris = (int) (kristina*1.1);

        int difference1 = zpMasha*12-masha*12;
        int difference2 = zpDenis*12-denis*12;
        int difference3 = zpKris*12-kristina*12;
        System.out.println("Маша теперь получает "+ zpMasha +" рублей. Годовой доход вырос на: "+ difference1 +" рублей.");
        System.out.println("Денис теперь получает "+ zpDenis +" рублей. Годовой доход вырос на: "+ difference2 +" рублей.");
        System.out.println("Кристина теперь получает "+zpKris + " рублей. Годовой доход вырос на: "+ difference3 +" рублей.");
    }
}