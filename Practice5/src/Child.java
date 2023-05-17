

    public class Child extends Parent {
    int bonus = 10000;

        public static void main(String[] args) {
            Child child = new Child();
            System.out.println("child deposit :" +child.deposit);

            System.out.println("child salary is:" +child.salary);
            System.out.println("Bonus of Child is:" + child.bonus);
        }
    }

