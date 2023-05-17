import org.w3c.dom.ls.LSOutput;

public class Child2 extends Parent{

    int gross = 20000;

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println("child2 salary is :" +child2.salary);
        System.out.println("child2 gross is:" + child2.gross);
    }


}
