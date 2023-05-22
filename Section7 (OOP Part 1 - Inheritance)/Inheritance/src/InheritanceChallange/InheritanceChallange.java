package InheritanceChallange;

public class InheritanceChallange {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1985", "01/01/2020", 35000);
        System.out.println(joe.collectPay());
        joe.retire();
        System.out.println(joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "11/11/1985", "01/01/2020", 15);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());

    }

}
