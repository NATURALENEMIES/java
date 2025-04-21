package china.hb.hd;

public class Family {
private double money; // 私有属性，仅本类可访问
public String doorPlate; // 公共属性，任意位置可访问

// 默认访问权限（包内可见），只能在同包内调用
void getVehicle() {
System.out.println("调用家庭运输工具");
}

// 受保护方法，子类或同包内可访问
public void getSecret() {
System.out.println("祖传秘方已启用");
}
}
