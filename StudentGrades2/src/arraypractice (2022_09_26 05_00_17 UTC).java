public class arraypractice {
   public static void main(String[] args){
        float[] marks = {45.7f ,65.8f , 63.4f , 99.2f ,100.0f};
        float sum = 0;
        for (float elements:marks){
            sum= sum + elements;
        }
        System.out.println(sum);
    }
}
