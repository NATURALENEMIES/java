package wds;

interface Displayable {
	void display();
}

class Notice implements Displayable {
	@Override
	public void display() {
		System.out.println("֪ͨ����");
	}
}

class Car implements Displayable {
	@Override
	public void display() {
		System.out.println("��������");
	}
}

class Advertisement implements Displayable {
	@Override
	public void display() {
		System.out.println("�����Ϣ");
	}
}

public class A {
	public static void main(String[] args) {
		Displayable notice = new Notice();
		Displayable car = new Car();
		Displayable advertisement = new Advertisement();

		notice.display();
		car.display();
		advertisement.display();
	}
}
