package OOPS_Concepts.StaticKeyword;

public class EnumDemo1 {
    public static void main(String[] args) {

        System.out.println(URLS.google);
        System.out.println(URLS.vwo);
    }
}

enum URLS{
    google, vwo, katalon
}

  /* System.out.println(Day.FRIDAY);
        System.out.println(Day.MONDAY);
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}*/