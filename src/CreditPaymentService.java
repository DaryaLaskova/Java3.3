public class CreditPaymentService {
    public double calculate(double amount, double years, double percent) {
        double months = years * 12;
        double monthlyPercent = percent / 12 / 100;

        double monthlyPayment = amount * ((monthlyPercent * Math.pow((1 + monthlyPercent), months)) / (Math.pow((1 + monthlyPercent), months) - 1));
        return monthlyPayment;
    }

}

