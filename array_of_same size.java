class A{
    public static void main(String[] args){
        int[] a = { 1 , 2 , 3, 4, 5 };
        int n = a.length;
        int[] b = new int[n];

        int totalA = 1;

        for (int i = 0; i < n; i++) {
            totalA = totalA * a[i];
        }
        
    }
}