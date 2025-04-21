package china.beijing;

import china.hb.hd.Family;

public class SubFamily extends Family {
public void testAccess() {
// 测试访问父类成员
// money = 1000; // 错误：私有属性不可访问
doorPlate = "京A-2023"; // 正确：公共属性可访问
getSecret(); // 正确：protected 方法可在子类调用
// getVehicle(); // 错误：默认权限方法跨包不可访问
}
}
