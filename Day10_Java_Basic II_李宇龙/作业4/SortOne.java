import java.util.Scanner;

class SortOne 
{
	//打印数组的函数
	private static void printArr(int[] a){
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}


	//键盘录入10个整数，对这个10个数进行排序
	public static void main(String[] args) 
	{
		//定义一个长度为10的int类型数组
		int[] a= new int[10];							

		//输入10个整数
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			a[i] = scan.nextInt();
		}

		/*第一种排序方法(升序).思想：第一个数于后面的数依次做比较，
		如果大于对方，就交换彼此的数值。比较到最后一个数。然后第二个数
		和第一个数一样和后面的数作比较。直到最后一个数
		所以采用for嵌套循环来解决问题
		*/

		for(int i = 0; i < 9; i++){
			for(int j = i+1; j < 10; j++){
				int temp;
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("从小到大排列输入的10个数：");
		printArr(a);
	}
}
