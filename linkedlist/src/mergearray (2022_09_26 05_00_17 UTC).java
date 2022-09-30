public class mergearray {

    public static void mergesort(int a[], int b[], int n1 , int n2, int c[]) {
        int i=0, j=0, k=0;

        while(i<n1 && j<n2){
            if(a[i]< b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while (i<n1){
            c[k++] = a[i++];
        }
        while(j<n2){
            c[k++] = b[j++];
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {6, 7, 8};

        int n1 = a.length;
        int n2 = b.length;

        int c[] = new int[n1 + n2];

        mergesort(a, b, n1, n2, c);

        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(c[i]+" ");

        }
    }
}
