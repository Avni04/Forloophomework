package homeworkjan;

public class WhileOddEven {
    public static void main(String[] args) {

        System.out.println("Odd Numbers");

        int o=1;
        while (o<20) {
            System.out.println(o++);
            o++;
        }

        System.out.println("Even Numbers");
        int e= 1;
        while ( e<=20){
            System.out.println(++e);
            e++;
        }
    }
}
