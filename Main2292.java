import java.util.Scanner;
public class Main2292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int range=2;//범위의 최솟값 
		
		if(n==1)
			System.out.print(1);
		else {
			while(range<=n) {
				range=range+(6*count); //범위의 최솟값을 한싸이클 당 계산하면서 바꿔
				count++;//범위가 몇번째인지 증
			}
			System.out.println(count);
		}
		

	}

}
