public class Employee {
    int empNo;
    String ename;
    float basic, hra, da, netPay;

    float Calculate() {
        return basic + hra + da;
    }

    void haveData() {
        System.out.print("Enter no. of Employee: ");
        empNo = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Employee name: ");
        ename = System.console().readLine();
        System.out.print("Enter basic: ");
        basic = Float.parseFloat(System.console().readLine());
        System.out.print("Enter HRA: ");
        hra = Float.parseFloat(System.console().readLine());
        System.out.print("Enter DA: ");
        da = Float.parseFloat(System.console().readLine());
        netPay = Calculate();
        System.out.println();
    }

    void dispData() {
        System.out.println("Employee no. = " + empNo);
        System.out.println("Employee Name = " + ename);
        System.out.println("Basic = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Net Pay = " + netPay);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.haveData();
        emp.dispData();

    }

}
