//  1. Sort the sequence 2, 7, 1, 8, 9, 2, 5 using merge sort.


void mergeSort(std::vector<int>& array, int left, int right) {
    if (left < right) {
        int middle = left + (right - left) / 2;

        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);

        merge(array, left, middle, right);
    }
}