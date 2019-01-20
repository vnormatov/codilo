package codilo.lesson2;

class CyclicRotation {

    int[] solution(int[] A, int K) {
        int length = A.length;
        for (int j = 0; j < K; j++) {
            int lastElement = A[length - 1];
            for (int i = length - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = lastElement;
        }
        return A;
    }
}
