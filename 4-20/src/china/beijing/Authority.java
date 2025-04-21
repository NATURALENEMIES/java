package china.beijing;

public class Authority {
public static void main(String[] args) {
SubFamily sub = new SubFamily();
sub.testAccess();
sub.doorPlate = "京B-456"; // 正确：公共属性可访问
sub.getSecret(); // 正确：同包内可调用 protected 方法
// sub.getVehicle(); // 错误：默认权限跨包不可访问
}
}