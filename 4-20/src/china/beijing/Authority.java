package china.beijing;

public class Authority {
public static void main(String[] args) {
SubFamily sub = new SubFamily();
sub.testAccess();
sub.doorPlate = "��B-456"; // ��ȷ���������Կɷ���
sub.getSecret(); // ��ȷ��ͬ���ڿɵ��� protected ����
// sub.getVehicle(); // ����Ĭ��Ȩ�޿�����ɷ���
}
}