package C3;

// Main.java - 测试类
public class Main {
public static void main(String[] args) {
// 创建水果数组并存入各种水果对象
Fruit[] fruits = new Fruit[5];
fruits[0] = (Fruit) new Apple(0.15); // 0.15kg的苹果
fruits[1] = new Peach(0.12); // 0.12kg的桃子
fruits[2] = new Orange(0.18); // 0.18kg的橘子
fruits[3] = new Apple(0.20); // 0.20kg的苹果
fruits[4] = new Peach(0.10); // 0.10kg的桃子

// 遍历数组并输出水果类型和重量
for (Fruit fruit : fruits) {
System.out.println("水果类型: " + fruit.getType() +
", 重量: " + fruit.getWeight() + "kg");
}

/*
* 如果按照题目提示使用getClass().getName()方法，
* 可以将getType()方法替换为：
* public String getType() {
* return this.getClass().getSimpleName();
* }
* 但这样会输出类名(Apple/Peach/Orange)而非中文水果名
*/
}
}