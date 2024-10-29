public class Candidate {

    int rNo;
    String name;
    float score;
    String remarks;

    void assignRem() {
        if (score >= 50) {
            remarks = "selected";
        }
        if (score < 50) {
            remarks = " not selected";
        }
    }

    void enter() {
        System.out.print("Enter roll no.:- ");
        rNo = Integer.parseInt(System.console().readLine());
        System.out.print("Enter name :- ");
        name = System.console().readLine();
        System.out.print("Enter score :- ");
        score = Float.parseFloat(System.console().readLine());
        assignRem();
    }

    void display() {
        System.out.println("Roll no.:- " + rNo);
        System.out.println("name :- " + name);
        System.out.println("Score :- " + score);
        System.out.println("Remarks :- " + remarks);
    }

    public static void main(String args[]) {
        Candidate c = new Candidate();
        c.enter();
        c.display();

    }

}
