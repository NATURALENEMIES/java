package A1;

class Advertisement implements Displayable {
private String message;

public Advertisement(String message) {
this.message = message;
}

@Override
public void display() {
System.out.println("�����Ϣ: " + message);
}
}
