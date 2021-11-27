public class ProgrammNumbers {

    public static void main(String[] args) {
        Numbers numbersSum = new Numbers();
        int sum = numbersSum.sum(6);
        int degree = numbersSum.root(4,3);
        double roots = numbersSum.sqrt(30);

        System.out.println(roots);
    }
}
