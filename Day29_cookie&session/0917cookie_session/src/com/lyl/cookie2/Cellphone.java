package com.lyl.cookie2;

public class Cellphone {

	private String id;			//�ֻ����
	private String name;		//�ֻ�Ʒ��
	private String price;		//�ֻ�����
	private String color;		//�ֻ���ɫ
	private String rom;			//ֻ���洢��С
	private String memory;		//�ֻ��洢��С
	
	public Cellphone(String id, String name, String price, String color,
			String rom, String memory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.rom = rom;
		this.memory = memory;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Cellphone [id=" + id + ", name=" + name + ", price=" + price
				+ ", color=" + color + ", rom=" + rom + ", memory=" + memory
				+ "]";
	}
	
}
