public class RewardValue {

    private double cashValue;
    private int milesValue;
    private static double conversionRate = 0.0035; //Each 1 mile is worth $0.0035

    /**
     * When provided a cash value, miles earned becomes the cashValue / conversionRate
     * @param cashValue The cashValue spent
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / conversionRate);

    }

    /**
     * When provided the miles value, cash value of miles becomes milesValue * converstionRate
     * @param milesValue
     */
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }

    /**
     *
     * @return The cash value of the RewardValue
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     *
     * @return How many miles the RewardValue is worth
     */
    public double getMilesValue() {
        return milesValue;
    }
}
