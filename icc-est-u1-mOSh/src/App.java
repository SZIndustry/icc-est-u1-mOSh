import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        ShellSort sS = new ShellSort();
        int[] a = {-10, 0, 4, 7, 2, 1, 9, 6, 5};

        System.out.println();

        System.out.println("original");
        sS.printArray(a);

        System.out.println("arreglado descendente");
        sS.sort(a, true);

        System.out.println("arreglado ascendente");
        sS.sort(a, false);
    }
}
