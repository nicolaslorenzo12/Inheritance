package inheritance;

public class Payment {

    public static void main(String[] args) {

        var boss = new Manager("Nicolas", "Lorenzo", 10000);
        var employee1 = new Employee("Luisa", "Perez", 3000);
        var employee2 = new Employee("Angel", "Sandoval", 4000);

        boss.setBonus(500);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = employee1;
        staff[2] = employee2;

        for(int e = 0; e < staff.length; e++){
            System.out.println(staff[e].getName() + " " + staff[e].getLastName() + " " + staff[e].getSalary() + "$");
        }

    }
}
