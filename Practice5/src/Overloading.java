public class Overloading {


    void add (String name, double b)
     {

         System.out.println(name + b);
     }
    void add (int a, int b, int c)
       {
           System.out.println(a + b + c);
       }
    public static void main(String[] args) {

        Overloading overloading = new Overloading();
      //  overloading.add(30,20);
     //   overloading.add(75,89,80);
        overloading.add("harry",30.5);
        overloading.add(70,40,50);

            }
        }






