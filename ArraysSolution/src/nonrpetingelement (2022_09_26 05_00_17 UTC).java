public class nonrpetingelement {
    public static void main(String[] args) {

        int array[] = {100 , 1 , 20 , 30 , 40 , 100 , 100, 20};
        boolean check;
        for(int i =0 ;i< array.length-1;i++){
            check = false;
            for(int j=0;j< array.length-1;j++){
                if(array[i]== array[j]&& i!=j){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(array[i]);
            }
        }
    }
}
