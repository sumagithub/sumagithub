public class maxDifferenceArrayElements {

    public static void main(String[] args) {
        
        int[] a = {1,4,14,20,180,89};
     int difference=0;
    int maxDifference=0;

for (int j=0; j < a.length-1;j++){
    difference=a[j+1] - a[j];
    

    if(difference>maxDifference){


        maxDifference=difference;
    }
    
}
System.out.println(maxDifference);
    }


}

