package codilo.lesson2;

class OddOccurrencesInArray {
//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

    int solution(int[] A) {

        int arrayLenght = A.length;
        int firstElement;
        int countEqElements = 0;
        for (int i = 0; i < arrayLenght; i++) {
            if (A[i] != 0) {
                firstElement = A[i];
            } else continue;
            for (int j = i + 1; j < arrayLenght; j++) {
                if (A[j] == firstElement) {
                    countEqElements++;
                    A[j] = 0;
                }
            }
            if (countEqElements % 2 == 0 || i == arrayLenght - 1) return firstElement;
            else countEqElements = 0;
        }
        return 0;
    }

}
