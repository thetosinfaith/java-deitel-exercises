package Assignments;

public class riderCommission {
    public int calculateCommission(int number) {
        int salary = 0;
        if (number < 50){
           salary =number * 160 + 5000;
        }
        return salary;
    }
}
