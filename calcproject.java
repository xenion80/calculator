package company;
import java.util.Scanner;
class calcualtion3 extends Exception {
    //making a custom exception class just for fun
    @Override
    public String toString() {
        return " the max no is 10000";
    }
}
class calcualtion1 extends Exception {
    //making a custom exception class just for fun
    @Override
    public String toString() {
        return " the limit is only 7000";
    }
}
class calcualtion extends Exception {
    //making a custom exception class just for fun
    @Override
    public String toString() {
        return "please take valid no while using division";
    }
}


    class numbers1 {
        int a;
        int b;


        public numbers1 () throws calcualtion3 {
            //constructor that will invoke automatically and take the input of a and b
            Scanner q = new Scanner(System.in);
            Scanner z = new Scanner(System.in);
            System.out.println("enter the a");
            this.a = q.nextInt();
            System.out.println("enter the b");

            this.b = z.nextInt();
            if (a > 10000 || b > 10000) {
                throw new calcualtion3();

            }


        }

    }


    class calculator extends numbers1  {
                public calculator() throws calcualtion3 {
                    super();
                }

                //calculator extending the first class so that it will run the contents of numbers1 as it has constructor and not any other class
                public void no1() throws calcualtion, calcualtion1 {
                    //this class can throw the custom exception according to the condition given
                    Scanner ac = new Scanner(System.in);
                    System.out.println("the following calculation are available:\n1. addition \n2. subtration \n3. multiplication \n4. dividion");
                    int calculator = ac.nextInt();

                    switch (calculator) {
                        case 1:
                            System.out.println("addition\t");
                            System.out.println(a + b);
                            break;

                        case 2:
                            System.out.println("subtraction\t");
                            System.out.println(a - b);
                            break;
                        case 3:
                            System.out.println("multiplication\t");
                            if (a > 7000 || b > 7000) {
                                throw new calcualtion1();
                            }
                            System.out.println(a * b);
                            break;
                        case 4:
                            System.out.println("division\t");
                            //the condition for the custom exception has been given
                            if (b == 0) {
                                throw new calcualtion();
                            }
                            System.out.println(a / b);
                            break;
                        default:
                            System.out.println("please take valid input between 1 and4");


                    }

                }
            }


            public class calcproject {

                public static void main(String[] args) {
                    //running only calculator class so that it will run the first class as well because the first class has a constructor and surrounding it in try catch statement
                    //so that it will catch the custom exception we have put in place
                    try {
                        calculator r = new calculator();
                        r.no1();
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }



