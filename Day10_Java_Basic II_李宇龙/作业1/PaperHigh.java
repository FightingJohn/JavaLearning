class PaperHigh 
{
	/*我国最高山峰是珠穆朗玛峰：8848m，
	我现在有一张足够大的纸张，厚度为：0.01m。
	请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
	*/

	public static void main(String[] args) 
	{
		int everest = 8848;     //代表珠穆朗玛峰的高度
		float onePaper = 0.01f; //代表一张纸的厚度
		int count = 0;			//记录折叠次数

		while(onePaper <= everest){
			
			onePaper = onePaper * 2;
			count++;
		}
		System.out.println("一张0.01毫米的纸折叠 " + count + "次后的厚度不低于珠穆朗玛峰");
	}
}
