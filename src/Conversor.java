public class Conversor {

    public static String convertirMoneda(String conversion){

        String url ="";

        if (conversion.equals("1")) {
            return url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/USD/COP/";
        } else if (conversion.equals("2")) {
            return  url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/COP/USD/";
        } else if (conversion.equals("3")) {
            return url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/ARS/USD/";
        } else if (conversion.equals("4")) {
            return url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/USD/ARS/";
        } else if (conversion.equals("5")) {
            return url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/EUR/COP/";
        } else if (conversion.equals("6")) {
            return url = "https://v6.exchangerate-api.com/v6/9410c37e413580f92d5c2326/pair/COP/EUR/";
        }
        return url;
    }

}
