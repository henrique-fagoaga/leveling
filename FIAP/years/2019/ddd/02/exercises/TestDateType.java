public class TestDateType {
    public static void main (String[] args) {
        // #1 scenario
        DateType firstDate = new DateType(2, 10, 2018);
        System.out.println("#1 02/10/2018 - ehValida? = " + firstDate.ehValida());

        // #2 scenario
        DateType secondDate = new DateType(30, 2, 2015);
        System.out.println("#2 30/02/2015 - ehValida? = " + secondDate.ehValida());

        // #3 scenario
        DateType thirdDate = new DateType(29, 2, 2012);
        System.out.println("#3 29/02/2012 - ehValida? = " + thirdDate.ehValida());

        // #4 scenario
        DateType fourthDate = new DateType(29, 2, 1900);
        System.out.println("#4 29/02/1900 - ehValida? = " + fourthDate.ehValida());

        // #5 scenario
        DateType fifthDate = new DateType(31, 6, 2005);
        System.out.println("#5 31/06/2005 - ehValida? = " + fifthDate.ehValida());
    }
}
