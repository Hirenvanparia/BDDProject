public class IfElse {
    public static void main(String[] args) {

        int percentage = 49; // this is your score

        if (percentage>=90)
        {
            System.out.println("grade=Dist");
        }else if (percentage>=70)
              {
                  System.out.println("grade=First");
              } else if (percentage>=60)
                  {
                      System.out.println("grade=Second");
                  } else if (percentage>=50)
                      {
                          System.out.println("grade=Pass");
                      } else
                          {
                              System.out.println("grade=failed");// til 49 it will fail

                          }



        }

    }


