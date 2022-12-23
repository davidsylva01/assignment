public class TwelveDaysOfChristmasMain {
    private static int day;
    private static String a;

    public static void main(String[] args) {
        TwelveDaysOfChristmas twelveDaysOfChristmas = new TwelveDaysOfChristmas();

        for (day = 1; day <= 12; day++) {

            switch (day) {
                case 1:
                   a = "first";
                    break;
                case 2:
                    a ="second";
                    break;
                case 3:
                    a = "third";
                    break;
                case 4:
                    a = "fourth";
                    break;
                case 5:
                    a = "fifth";
                    break;
                case 6:
                    a = "sixth";
                    break;
                case 7:
                    a = "seventh";
                    break;
                case 8:
                    a = "eighth";
                    break;
                case 9:
                    a = "ninth";
                    break;
                case 10:
                    a = "tenth";
                    break;
                case 11:
                   a = "eleventh";
                    break;
                case 12:
                    a = "twelth";
                    break;

            }


            System.out.println("On the" + a + " Day of Christmas my true love gave to me ");

            switch (day) {

                case 12:
                    System.out.println(TwelveDaysOfChristmas.getTwelfthVerse());
                case 11:
                    System.out.println(TwelveDaysOfChristmas.getEleventhVerse());
                case 10:
                    System.out.println(TwelveDaysOfChristmas.getTenthVerse());
                case 9:
                    System.out.println(TwelveDaysOfChristmas.getNinthVerse());
                case 8:
                    System.out.println(TwelveDaysOfChristmas.getEighthVerse());
                case 7:
                    System.out.println(TwelveDaysOfChristmas.getSeventhVerse());
                case 6:
                    System.out.println(TwelveDaysOfChristmas.getSixthVerse());
                case 5:
                    System.out.println(TwelveDaysOfChristmas.getFifthVerse());
                case 4:
                    System.out.println(TwelveDaysOfChristmas.getFourthVerse());
                case 3:
                    System.out.println(TwelveDaysOfChristmas.getThirdVerse());
                case 2:
                    System.out.println(TwelveDaysOfChristmas.getSecondVerse());
                case 1:
                    System.out.println(TwelveDaysOfChristmas.getFirstVerse());
            }
        }

    }

}
