public class For {
   public static void main(String[] args) {
    int nim[] = {2,1,4,1,1,7,6,2,0,8,8};
    int total = 0;

    for (int i =0; i<nim.length;i++){
        total += nim[i];
    }
    System.out.println(total);
   }
}
