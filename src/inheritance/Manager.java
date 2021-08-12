package inheritance;

public class Manager extends  Employee {

    private int bonus;

    public Manager(String name, String lastName, int salary){
        super(name, lastName, salary);
        bonus = 0;
    }

    public int getSalary(){
        int baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

}

