
package CodeGiaitri;

public class MergeSort {
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 3, 5, 6, 1, 4, 7, 2 };
		 
	        System.out.println("Given Array");
	        printArray(arr);
	 
	        MergeSort ob = new MergeSort();
	        ob.sort(arr, 0, arr.length - 1);
	 
	        System.out.println("\nSorted array");
	        printArray(arr);
	}


    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Tìm điểm chính giữa
            int m = l + (r - l) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    
    void merge(int arr[], int l, int m, int r){
        // l là chỉ số đầu tiên
        // r là chỉ số cuối cùng
        // m là chỉ số giữa(trung vị)
        
        int c1 = m - l + 1;
        int c2 = r - m;
        //c1 là kích thước của mảng con đầu tiên
        //c2 là kích thước của mảng con sau  
        
        //Mảng tạm
        int L[] = new int[c1];
        int R[] = new int[c2];
        
        
        //Lưu dữ liệu vào mảng tương ứng
        for(int i = 0; i < c1; ++i){
            L[i] = arr[l + i];
        }
        
        for(int j = 0; j < c2; ++j){
            R[j] = arr[m + 1 + j];
        }
        
        int i = 0, j = 0;
        
        int k = l;
        while (i < c1 && j < c2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < c1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < c2) {
            arr[k] = R[j];
            j++;
            k++;
        }
       
    }
}
