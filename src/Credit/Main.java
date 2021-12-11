package Credit;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit();
        credit1.Id = "Escobar221";
        credit1.sum = 20000;
        credit1.period = "31.12.2021";
        credit1.interestrate = 30.25;

        Credit credit2 = new Credit();
        credit2.Id = "Escobar221";
        credit2.sum = 20000;
        credit2.period = "31.12.2022";
        credit2.interestrate = 30.25;

        Credit credit3 = new Credit();
        credit3.Id = "Escobar221";
        credit3.sum = 20000;
        credit3.period = "31.12.2022";
        credit3.interestrate = 30.25;

        Credit credit4 = new Credit();
        credit4.Id = "Escobar221";
        credit4.sum = 20000;
        credit4.period = "31.12.2022";
        credit4.interestrate = 30.25;

        Credit credit5 = new Credit();
        credit5.Id = "Escobar221";
        credit5.sum = 20000;
        credit5.period = "31.12.2022";
        credit5.interestrate = 30.25;

        System.out.println("Количество выданных кредитов: " + Credit.count);
        System.out.println("Общая сумма выданных кредитов: " + Credit.count * credit1.sum);
        System.out.println("Средняя сумма кредитов: " + credit1.sum / Credit.count);
    }
}
