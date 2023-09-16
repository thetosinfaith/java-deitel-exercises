package Assignments;

public class riderCommission {
    public int calculateCommission(int successfulDeliveries) {
        int commission = 0;

        if (successfulDeliveries < 50) {
            commission = successfulDeliveries * 160 + 5000;
        } else if (successfulDeliveries < 60) {
            commission = successfulDeliveries * 200 + 5000;
        } else if (successfulDeliveries < 62) {
            commission = successfulDeliveries * 250 + 5000;
        } else if (successfulDeliveries < 84) {
            commission = successfulDeliveries * 500 + 5000;
        }

        return commission;
    }
}
