public class JavaTest {
    public static void main(String [] args){
        int [] arr = {1,8,0,3,2,0,0,6,5,0};
        int [] temp = new int[arr.length];
        int zero =0;
        for(int num: arr){
            if(num==0){
                zero++;
            }
        }for(int i=0;i<zero;i++){
            temp[i]=0;
        }for(int j=0;j<arr.length;j++){
            if(arr[j]==0){continue;}
            else{
                temp[zero++] = arr[j];
            }
        }for(int num: temp){
            System.out.print(num+" ");
        }
    }
}
