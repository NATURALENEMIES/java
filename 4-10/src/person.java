import java.util.Arrays;

public class person {
    private String name;
    private String gender;
    private int age;
    private person[] children;

    // 构造方法
    public person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.children = new person[0]; // 初始化为空数组
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 年龄增加1岁
    public void increaseAge() {
        age++;
    }

    // 获取子女数组的拷贝
    public person[] getChildren() {
        return Arrays.copyOf(children, children.length);
    }

    // 设置子女数组
    public void setChildren(person[] children) {
        if (children == null) {
            this.children = new person[0];
        } else {
            this.children = Arrays.copyOf(children, children.length);
        }
    }

    // 测试代码
    public static void main(String[] args) {
        // 创建父母对象
        person father = new person("张三", "男", 40);
        person mother = new person("李四", "女", 38);

        // 创建子女对象
        person child1 = new person("张五", "男", 10);
        person child2 = new person("张六", "女", 8);

        // 设置父母的子女
        father.setChildren(new person[]{child1, child2});
        mother.setChildren(new person[]{child1, child2});

        // 输出父亲信息
        System.out.println("父亲姓名：" + father.getName());
        System.out.println("父亲年龄：" + father.getAge());
        father.increaseAge();
        System.out.println("父亲过完生日后的年龄：" + father.getAge());

        // 输出父亲的子女信息
        System.out.println("\n父亲的子女：");
        for (person child : father.getChildren()) {
            System.out.println("姓名：" + child.getName() + "，年龄：" + child.getAge());
        }

        // 验证子女数组独立性（测试代码）
        person[] children = father.getChildren();
        children[0] = new person("测试", "未知", 0); // 修改拷贝的数组不影响原数据
        System.out.println("\n修改拷贝后的子女数组：");
        for (person child : father.getChildren()) {
            System.out.println("姓名：" + child.getName() + "，年龄：" + child.getAge());
        }
    }
}