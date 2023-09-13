import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {
        int basNumber;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayısı : ");
        basNumber=input.nextInt();
        for(int i=basNumber;1<=i;i--){
            for(int k=i;k<basNumber;k++){
                System.out.print(" ");
            }
            for (int j=((i*2)-1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
