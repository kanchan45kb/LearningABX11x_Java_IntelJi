package operator;

public class ternaryOrConditionalOperator {
    public static void main(String[] args) {
        int age = 10;
        String vote = (age>18)?"You can vote":"You can not Vote";
       // System.out.println(vote);
        System.out.println(age>18?"You can vote":"You can not Vote");
        System.out.println("String Variable =(Condition)?true:false");
    }
}
