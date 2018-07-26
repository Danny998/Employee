import java.util.*;
import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;
    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireday = LocalDate.of(year,month,day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double premia,int daysInWeek){
        int i = 1;
        while(daysInWeek>=i){
        salary+=premia;
        i++;
        }
    }

        public void nightHours(double addition,int hoursInNight){
            addition*=hoursInNight;
            salary += addition;
        }
    public static void main(String[] args){
        Employee employee1 = new Employee("Daniel",2000,1998,11,5);
        Employee employee2 = new Employee("Krzysztof",3000,1998,2,2);
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ile dni byłeś w weekendy: ");
        int days = in.nextInt();
        employee1.raiseSalary(150,days);
        System.out.println("Podaj ile godzin byłeś w nocy: ");
        int nightHours  = in.nextInt();
        System.out.println("Podaj ile dostajesz za te godziny szczęściarzu: ");
        double addition = in.nextInt();
        employee1.nightHours(addition,nightHours);
        System.out.println("Twoje wynagrodzenie w tym miesiącu będzie wynosić: " + employee1.getSalary() + " brutto" );

    }
}
