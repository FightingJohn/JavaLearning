package com.lyl.homework;

public class HomeworkThree {

	/**
	 * @∂‡Ã¨
	 */
	public static void main(String[] args) {

		Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
		for(int i = 0; i < rodents.length; i++){
			rodents[i].makeHole();
		}

	}

}

//ƒˆ≥›∂ØŒÔ¿‡
class Rodent{
	
	protected void makeHole(){
		
		System.out.println("¥Ú∂¥");
	}
}

//¿œ Û
class Mouse extends Rodent{
	
	protected void makeHole(){
		System.out.print("¿œ Û∑«≥£œ≤ª∂ ");
		System.out.println("¥Ú∂¥");
	}
}

//˜˙ Û
class Gerbil extends Rodent{
	
	protected void makeHole(){
		System.out.print("˜˙ Ûœ≤ª∂ ");
		System.out.println("¥Ú∂¥");
	}
}

//¥Ûº’ Û
class Hamster extends Rodent{
	
	protected void makeHole(){
		System.out.print("¥Ûº’ Û≈º∂˚ ");
		System.out.println("¥Ú∂¥");
	}
}

