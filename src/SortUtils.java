public class SortUtils {

    public static void quickSort(int[] array){

        System.out.println("Before sorting: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        doSort(array, 0, array.length - 1);

        System.out.println();
        System.out.println("After sorting: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    private static void doSort(int[] array, int start, int end) {
            if(end > start){

                int pivot = array[start];//опорний елемент; в даному варіанті реалізації - перший елемент масиву.
                int i = start+1;
                int tmp;

                //поділ масиву
                for(int j = start+1; j<= end; j++){
                    if(pivot > array[j]){
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;

                        i++;
                    }
                }

                //міняємо місцями опорний елемент з останнім з переміщених; таким чином масив розбивається опорним елементом
                //на дві частини: зліва - елементи меньші від нього, справа - більші
                array[start] = array[i-1];
                array[i-1] = pivot;

                //рекурсивно викликаємо метод для елементів справа і зліва від опорного
                doSort(array, start, i-2);
                doSort(array, i, end);
            }
        }
}
