package com.lyl.homework;

public class HomeworkThree {

	/**
	 * @��̬
	 */
	public static void main(String[] args) {

		Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
		for(int i = 0; i < rodents.length; i++){
			rodents[i].makeHole();
		}

	}

}

//���ݶ�����
class Rodent{
	
	protected void makeHole(){
		
		System.out.println("��");
	}
}

//����
class Mouse extends Rodent{
	
	protected void makeHole(){
		System.out.print("����ǳ�ϲ�� ");
		System.out.println("��");
	}
}

//����
class Gerbil extends Rodent{
	
	protected void makeHole(){
		System.out.print("����ϲ�� ");
		System.out.println("��");
	}
}

//�����
class Hamster extends Rodent{
	
	protected void makeHole(){
		System.out.print("�����ż�� ");
		System.out.println("��");
	}
}

