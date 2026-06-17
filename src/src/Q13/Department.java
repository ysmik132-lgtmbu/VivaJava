//Bhudev Katawal
class Department {//Q13

    void checkBudgetStatus() {
        System.out.println(
                "Budget is Normal");
    }
}

class ScienceDept extends Department {

    @Override
    void checkBudgetStatus() {
        System.out.println(
                "Special Lab Fees Included");
    }
}

class eMain {

    public static void main(String[] args) {

        Department dept =
                new ScienceDept();

        dept.checkBudgetStatus();
        // Runtime method binding
    }
}
