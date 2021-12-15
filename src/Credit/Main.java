package Credit;
                                                          /*Тысячу извинений за нарушения инкапсуляции,
                                                          * Я поменял значения, и единственный момент,
                                                          * при выводе количества кредитов мозгов не хватило,
                                                          * попробовал по разному повторить ниже методы,
                                                          * только с новым average, памагите*/
public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit();
        credit1.setId("TokyoGhoulTop");
        credit1.setSum(1000);
        credit1.setPeriod("07.07.2007");
        credit1.setInterestrate(7.07);

        Credit credit2 = new Credit();
        credit2.setId("Escobar221");
        credit2.setSum(20000);
        credit2.setPeriod("31.12.2022");
        credit2.setInterestrate(30.25);

        Credit credit3 = new Credit();
        credit3.setId("RimuruTempest");
        credit3.setSum(35000);
        credit3.setId("18.08.2020");
        credit3.setInterestrate(19.02);

        Credit credit4 = new Credit();
        credit4.setId("GachiMuchi");
        credit4.setSum(40000);
        credit4.setPeriod("01.08.2023");
        credit4.setInterestrate(23.01);

        Credit credit5 = new Credit();
        credit5.setId("Yagami Lighto");
        credit5.setSum(10000);
        credit5.setPeriod("05.09.2018");
        credit5.setInterestrate(11.15);

        int sum = 0;
        int count1 = 0;
        int average = 0;
        Credit[] credits = {credit1, credit2, credit3, credit4, credit5};
        for (Credit credit : credits
        ) {
            sum = sum + credit.getSum();
            count1 = sum / credit.getSum();
        }
        System.out.println("Количество выданных кредитов: " + Credit.count);
        System.out.println("Общая сумма выданных кредитов: " + sum);
        System.out.println("Средняя сумма кредитов: " + count1);
    }
}
