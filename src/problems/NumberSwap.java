package problems;

/*
Number swap o(n) no temp
 */
public class NumberSwap {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        NumberSwap instance = new NumberSwap();
        System.out.print(instance.swap(a, b));
    }

    private String swap(int num1, int num2) {
        int n1 = num1, n2 = num2;
        n1 = num1 + num2; //150
        n2 = n1 - n2; //150-50
        n1 = n1 - n2;
        return "Num1: " + n1 + " & Num2: " + n2;
    }
}
