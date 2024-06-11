package CurrencyConverterApp;

class CurrencyConverter {
    private static final double SEK_TO_USD = 0.11;
    private static final double USD_TO_SEK = 9.10;
    private static final double SEK_TO_EURO = 0.094;
    private static final double EURO_TO_SEK = 10.64;private static final double USD_TO_EURO = 0.85;
    private static final double EURO_TO_USD = 1.18;

    public static double convert(String fromCurrency, String toCurrency, double amount) {
        return switch (fromCurrency + "to" + toCurrency) {
            case "SEKtoUSD" -> amount * SEK_TO_USD;
            case "USDtoSEK" -> amount * USD_TO_SEK;
            case "SEKtoEuro" -> amount * SEK_TO_EURO;
            case "Euro toSEK" -> amount * EURO_TO_SEK;
            case "USDtoEuro" -> amount * USD_TO_EURO;
            case "Euro toUSD" -> amount * EURO_TO_USD;
            default -> throw new IllegalArgumentException("Invalid currency conversion.");
        };
    }
}
