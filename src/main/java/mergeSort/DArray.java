package mergeSort;

public class DArray {
    private long[] theArray; //ссылка на массив theArray
    private int nElems; //Количество элементов данных

    public DArray(int max){ //конструктор
        theArray = new long[max]; //создание массива
        nElems = 0;
    }
    public void insert(long value){ //занесение элемента в массив
        theArray[nElems] = value; // вставка элемента
        nElems++; //увеличение размера
    }
    public void display(){ //вывод содержимого массива
        for (int j = 0; j < nElems; j++) // для каждого элемента
            System.out.print(theArray[j] + " "); //вывод
        System.out.println("");
    }
    public void mergeSort(){ // вызывается из main()
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }
    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound){
        if (lowerBound != upperBound) {
            int mid = (lowerBound + upperBound) / 2; // поиск середины
            recMergeSort(workSpace, lowerBound, mid); // сортировка нижней половины
            recMergeSort(workSpace, mid+1, upperBound); // сортировка верхней половины
            merge(workSpace, lowerBound, mid+1, upperBound); // слияние
        }
    }
    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound){
        int j = 0; // индекс в рабочей области
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1; // количество элементов

        while (lowPtr <= mid && highPtr <= upperBound)
            if (theArray[lowPtr] < theArray[highPtr])
                workSpace[j++] = theArray[lowPtr++];
        else
                workSpace[j++] = theArray[highPtr++];

        while (lowPtr <= mid)
            workSpace[j++] = theArray[lowPtr++];

        while (highPtr <= upperBound)
            workSpace[j++] = theArray[highPtr++];

        for (j = 0; j < n; j++)
            theArray[lowerBound+j] = workSpace[j];
    }
}
