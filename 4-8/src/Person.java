
class Person {
	private String name;
	private String gender;
	private int age;
	private Person[] children;

	public Person(String name, String gender, int age, Person[] children) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void incrementAge() {
		age++;
	}

	public Person[] getChildren() {
		return children;
	}

	public void setChildren(Person[] children) {
		this.children = children;
	}

	@Override
	public String toString() {
		StringBuilder childNames = new StringBuilder();
		if (children != null) {
			for (Person child : children) {
				childNames.append(child.getName()).append(", ");
			}
			if (childNames.length() > 2) {
				childNames.setLength(childNames.length() - 2);
			}
		}
		return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + ", children=["
				+ childNames + "]" + '}';
	}
}

public class Person {
	public static void main(String[] args) {
		Person child1 = new Person("С��", "��", 10, null);
		Person child2 = new Person("С��", "Ů", 8, null);
		Person[] children = { child1, child2 };

		Person parent = new Person("����", "��", 35, children);

		System.out.println("��ʼ��Ϣ: " + parent);

		parent.incrementAge();
		System.out.println("����1������Ϣ: " + parent);

		Person newChild = new Person("Alice", "Female", 6, null);
		Person[] newChildren = new Person[children.length + 1];
		System.arraycopy(children, 0, newChildren, 0, children.length);
		newChildren[children.length] = newChild;
		parent.setChildren(newChildren);
		System.out.println("��������Ů�����Ϣ: " + parent);
	}
}