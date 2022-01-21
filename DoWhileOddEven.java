package homeworkjan;

public class DoWhileOddEven {
    public static void main(String[] args) {

        System.out.println("These are the odd numbers");
        int o=1;

        do{
            System.out.println(o++);
            o++;

        } while (o<20);

        System.out.println("These are the even numbers");

        int e= 2;
        do{
            System.out.println(e++);
            e++;
        } while(e<=20);
    }
}
