
public class maxOfArrayElements {

    public static void main(String[] args) {
        
        int[] a = {1,4,14,20,180,89};
     int difference=0;

for (int j=0; j < a.length-1;j++){

    if(a[j+1] > a[j]){


        difference=a[j+1];
    }
    
}
System.out.println(difference);
    }


}
