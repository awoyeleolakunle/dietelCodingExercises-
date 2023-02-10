package Practices;

public class OppPractices {
    public static void main(String[] args) {
 CommissionEmployee  commissionEmployee= new CommissionEmployee("sue", "Jones",
         "222-22-2222", 10000, .06);

 BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
         "333-33-3333", 5000, .04, 300);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n",commissionEmployee.toString());
        System.out.printf( basePlusCommissionEmployee.toString());


        }

}

class CommissionEmployee {
    private String lastName;
    private String firstName;
    private String socialSecurityNumber;
    private int grossSalary;
    private double commissionRate;
        public CommissionEmployee(String lastName, String firstName, String socialSecurityNumber,
                                  int grossSalary, double commissionRate) {
            this.lastName = lastName;
            this.firstName= firstName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.grossSalary = grossSalary;
            this.commissionRate = commissionRate;

        }

        public String toString() {
            return """
                    commission employee: %s %s
                    social security number: %s
                    gross sales: %s
                    commission rate: %s
                    """;
        }
    }

    class BasePlusCommissionEmployee {
        public BasePlusCommissionEmployee(String lastName, String firstName, String socialSecurityNumber,
                                          int grossSalary, double commissionRate, int baseSalary) {
        }
        public String toString() {
            return """
                    commission employee: %s %s
                    social security number: %s
                    gross sales: %s
                    commission rate: %s
                    baseSalary: %s
                    """;
    }
}





