class A {
    public static void main(String[] args) {

        int[] arr = {3 , 4, 1 , 2};
        int n = arr.length;

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        int time = 0;

        for (int i = 0; i < n; i++) {
            time = time + (max - arr[i]);
        }

        System.out.println(time);
    }
}