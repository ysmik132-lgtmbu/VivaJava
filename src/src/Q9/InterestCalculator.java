class InterestCalculator {//Q9

    static double calculateCompoundInterest(
            double principal,
            double rate,
            int time) {

        return principal *
                Math.pow((1 + rate / 100), time);
        // Returns calculated amount
    }

    public static void main(String[] args) {

        double amount =
                calculateCompoundInterest(
                        10000, 10, 2);

        System.out.println(
                "Final Amount = " + amount);
    }
}
