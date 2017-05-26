/**
 * Created by samsung on 2017/5/24.
 */
public class InsertSort {
    public static void  main(String[]args ){
            int[] array = {8,3,2,1,7,4,6,5 };
            array = sort(array);
    }

    public static int[] sort(int[] array){
        int minIndex = 0;
        int j = 0;
        for(int i = 0 ; i < array.length -1;i++){
            for( j = i + 1,minIndex = i;j < array.length;j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            printArray(array,array[minIndex],array[i]);
        }
        return array;
    }

    public static void printArray(int[] array,int a ,int b){
        System.out.print("[");
        for (int i = 0 ; i < array.length ;i++){
            if(i == array.length -1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("]");
        System.out.println(" " + a + " <----> "+ b);
    }
}
