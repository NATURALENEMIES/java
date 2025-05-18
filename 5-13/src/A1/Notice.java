package A1;

class Notice implements Displayable {
private String content;

public Notice(String content) {
this.content = content;
}

@Override
public void display() {
System.out.println("Í¨ÖªÄÚÈİ: " + content);
}
}
