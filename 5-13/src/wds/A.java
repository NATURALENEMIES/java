package wds;

interface Displayable {
	void display();
}

class Notice implements Displayable {
	@Override
	public void display() {
		System.out.println("通知内容");
	}
}

class Car implements Displayable {
	@Override
	public void display() {
		System.out.println("汽车油量");
	}
}

class Advertisement implements Displayable {
	@Override
	public void display() {
		System.out.println("广告消息");
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
