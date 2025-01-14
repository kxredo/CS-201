// Suppose you are given an array of N integers containing the birth years
// of students. Write an O(N) algorithm to sort these birth years.
// void sortBirthYears (int [] A)


void sortBirthYears(int[] A) {
    // Step 1: Find the minimum and maximum birth years in A
    int minYear = A[0], maxYear = A[0];
    for (int year : A) {
        if (year < minYear) {
            minYear = year;
        } else if (year > maxYear) {
            maxYear = year;
        }
    }
    
    // Step 2: Create a count array to store the frequency of each birth year
    int range = maxYear - minYear + 1;
    int[] count = new int[range];
    for (int year : A) {
        count[year - minYear]++;
    }
    
    // Step 3: Overwrite the input array A with sorted years
    int index = 0;
    for (int i = 0; i < range; i++) {
        while (count[i] > 0) {
            A[index++] = i + minYear;
            count[i]--;
        }
    }
}
