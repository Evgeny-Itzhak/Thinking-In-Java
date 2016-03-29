package com.company.home.Chapter5;

/**
 * Created by Itzhak on 10.02.2016.
 */
public class EnumTask21 {

    MoneyType moneyType;

    EnumTask21(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public enum MoneyType {
        DOLLAR_USA, UKRAINIAN_HRYVNA, RUSSIAN_RUBBLE, EURO, TENGE, FUNT
    }

    private static void moneyTypeDescribe() {
        for (MoneyType moneyType : MoneyType.values()) {
            System.out.println(moneyType + " => ordinal: " + moneyType.ordinal());
        }
    }

    private void moneyDefiner() {
        System.out.print("This is ");

        switch (moneyType) {
            case DOLLAR_USA:
                System.out.println("american dollar");
                break;
            case UKRAINIAN_HRYVNA:
                System.out.println("Ukrainian hrivna");
                break;
            case RUSSIAN_RUBBLE:
                System.out.println("Russian rubble");
                break;
            case EURO:
                System.out.println("Europinian euro");
                break;
            case TENGE:
                System.out.println("Armenian tenge");
                break;
            case FUNT:
                System.out.println("English funt");
                break;
            default:
                System.out.println("nothing");
        }
    }


    public static void main(String[] args) {

        EnumTask21 dollar = new EnumTask21(MoneyType.DOLLAR_USA),
                hryvna = new EnumTask21(MoneyType.UKRAINIAN_HRYVNA),
                rubble = new EnumTask21(MoneyType.RUSSIAN_RUBBLE),
                euro = new EnumTask21(MoneyType.EURO),
                tenge = new EnumTask21(MoneyType.TENGE),
                funt = new EnumTask21(MoneyType.FUNT);

        dollar.moneyDefiner();
        hryvna.moneyDefiner();
        rubble.moneyDefiner();
        euro.moneyDefiner();
        tenge.moneyDefiner();
        funt.moneyDefiner();

        System.out.println();
        moneyTypeDescribe();


    }
}

