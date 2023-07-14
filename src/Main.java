import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(2,"Java",new int[]{3,4,56,5,});
        class1.setArray(new int[]{4,5,6,4,46,4});
        System.out.print(class1.getNomber()+" "+class1.getWord()+" ");
        for (int arr : class1.getArray()){
            System.out.print(arr);
        }

    }
}