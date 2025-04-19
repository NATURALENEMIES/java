package ch7;
class People {
    protected double height;
    protected double weight;

    public void speakHello() {
        System.out.println("Hello!");
    }

    public void averageHeight() {
        System.out.println("Average height of people.");
    }

    public void averageWeight() {
        System.out.println("Average weight of people.");
    }
}

class ChinaPeople extends People {
    @Override
    public void speakHello() {
        System.out.println("��ã�");
    }

    @Override
    public void averageHeight() {
        System.out.println("�й��˵�ƽ����ߡ�");
    }

    @Override
    public void averageWeight() {
        System.out.println("�й��˵�ƽ�����ء�");
    }

    public void chinaGongfu() {
        System.out.println("�����й�����");
    }
}

class AmericanPeople extends People {
    @Override
    public void speakHello() {
        System.out.println("Hi!");
    }

    @Override
    public void averageHeight() {
        System.out.println("�����˵�ƽ����ߡ�");
    }

    @Override
    public void averageWeight() {
        System.out.println("�����˵�ƽ�����ء�");
    }

    public void americanBoxing() {
        System.out.println("��������ȭ����");
    }
}

class BeijingPeople extends ChinaPeople {
    @Override
    public void speakHello() {
        System.out.println("���ã�");
    }

    @Override
    public void averageHeight() {
        System.out.println("�����˵�ƽ����ߡ�");
    }

    @Override
    public void averageWeight() {
        System.out.println("�����˵�ƽ�����ء�");
    }

    public void beijingOpera() {
        System.out.println("���ݾ��硣");
    }
}

public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.speakHello();
        people.averageHeight();
        people.averageWeight();

        ChinaPeople chinaPeople = new ChinaPeople();
        chinaPeople.speakHello();
        chinaPeople.averageHeight();
        chinaPeople.averageWeight();
        chinaPeople.chinaGongfu();

        AmericanPeople americanPeople = new AmericanPeople();
        americanPeople.speakHello();
        americanPeople.averageHeight();
        americanPeople.averageWeight();
        americanPeople.americanBoxing();

        BeijingPeople beijingPeople = new BeijingPeople();
        beijingPeople.speakHello();
        beijingPeople.averageHeight();
        beijingPeople.averageWeight();
        beijingPeople.beijingOpera();
    }
}