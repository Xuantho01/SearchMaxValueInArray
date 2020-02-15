import java.util.Scanner;
public class SearchmaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        // input size
        do{
            System.out.println("Eter size of array: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20!");
            }
        }while(size > 20);
        // input vale in array
        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //show array
        for(int j = 0; j< array.length; j++){
            System.out.print(array[j]+ " ");
        }

        // check max value in array
        int max = array[0];
        for(int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }
        System.out.println("\n"+ "The largest property value in the list is: " + max);
    }
}
