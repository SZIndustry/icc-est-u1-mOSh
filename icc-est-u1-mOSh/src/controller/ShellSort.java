package controllers;

public class ShellSort {
    
    public void sort(int[] arr, boolean conditional) {
        int n = arr.length;

        if (conditional) {
            for (int gap = n / 2; gap > 0; gap /= 2) {  
                int countChange = 0;
                for (int i = gap; i < n; i++) {
                    int aux = arr[i];
                    int j = i;
    
                    while (j >= gap && arr[j - gap] > aux) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                        countChange++;
                    }
                    arr[j] = aux;
                }
                System.out.println(countChange + " cambios " + "en gap " + gap);
                printArray(arr);
                System.out.println();
    
            }
        }

        else {
            for (int gap = n / 2; gap > 0; gap /= 2) {  
                int countChange = 0;
                for (int i = gap; i < n; i++) {
                    int aux = arr[i];
                    int j = i;
    
                    while (j >= gap && arr[j - gap] > aux) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                        countChange++;
                    }
                    arr[j] = aux;
                }
                System.out.println(countChange + " cambios " + "en gap " + gap);
                printArray(arr);
                System.out.println();
    
            }
        }
    }

    public void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
