public class Employee {
    final String name;
    double salary;
    int workHours;
    final int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary > 1000)
            return salary * 0.03;

        return 0;
    }

    public double bonus(){
        if (this.workHours > 40 )
            return (workHours - 40) * 30;
        else
            return 0;
    }

    public double raiseSalary(){
        int currentYear = 2021;

        if(currentYear - hireYear < 10) {
            double oldSalary = this.salary;
            this.salary = this.salary * 1.05 - this.tax() * 1.05 + this.bonus();
            return this.salary - oldSalary;
        }
        else if(currentYear - hireYear > 9 && hireYear - currentYear < 20){
            double oldSalary = this.salary;
            this.salary = this.salary * 1.10 - this.tax() * 1.10 + this.bonus();
            return this.salary - oldSalary;
        }
        else{
            double oldSalary = this.salary;
            this.salary = this.salary * 1.15 - this.tax() * 1.15 + this.bonus();
            return this.salary - oldSalary;
        }
    }

    public String toString(){
        return "Information of The Employee;\n" + "Name : " + this.name + "\nSalary : " + this.salary + "\nWork Hours : " + this.workHours + "\nHire Year : " + this.hireYear + "\nTax : " + this.tax() + "\nBonus : " + this.bonus() + "\nSalary Increase : " + this.raiseSalary() + "\nSalary with Bonus(Tax added) : " + (this.salary - this.tax() + this.bonus()) + "\nNet Salary : " + (this.salary + this.bonus());
    }
}
