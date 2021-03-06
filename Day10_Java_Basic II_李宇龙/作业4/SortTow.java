import java.util.Scanner;

class SortTow
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

		/*第二种排序方法（升序）把第i个数值插入到前i-1个中的合适位置中去
		例如第三个数小于第二个数，就把第三个数放到第二个数的左边，第三个数继续
		和第一个数比较，如果大于则不移动，否则放到第一个数左边
		*/
		for(int i = 2; i < 10; i++)  
		{  
			a[0] = a[i];  
			int j = i - 1;  
			while(a[0] < a[j])  
			{  
				a[j + 1] = a[j];
				j = j - 1; 
			}  
			a[j+1] = a[0];  
		}  
		System.out.println("从小到大排列输入的10个数：");
		printArr(a);
	}
}
