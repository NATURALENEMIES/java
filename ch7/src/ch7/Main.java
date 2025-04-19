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
        System.out.println("你好！");
    }

    @Override
    public void averageHeight() {
        System.out.println("中国人的平均身高。");
    }

    @Override
    public void averageWeight() {
        System.out.println("中国人的平均体重。");
    }

    public void chinaGongfu() {
        System.out.println("表演中国功夫。");
    }
}

class AmericanPeople extends People {
    @Override
    public void speakHello() {
        System.out.println("Hi!");
    }

    @Override
    public void averageHeight() {
        System.out.println("美国人的平均身高。");
    }

    @Override
    public void averageWeight() {
        System.out.println("美国人的平均体重。");
    }

    public void americanBoxing() {
        System.out.println("表演美国拳击。");
    }
}

class BeijingPeople extends ChinaPeople {
    @Override
    public void speakHello() {
        System.out.println("您好！");
    }

    @Override
    public void averageHeight() {
        System.out.println("北京人的平均身高。");
    }

    @Override
    public void averageWeight() {
        System.out.println("北京人的平均体重。");
    }

    public void beijingOpera() {
        System.out.println("表演京剧。");
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