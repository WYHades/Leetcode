package leetCODE;

public class D16_11 {
	/*
	 * ������ʹ��һ��ľ�彨����ˮ�塣���������͵�ľ�壬���г��Ƚ϶̵�ľ�峤��Ϊshorter�����Ƚϳ���ľ�峤��Ϊlonger��
	 * ���������ʹ��k��ľ�塣��дһ��������������ˮ�����п��ܵĳ��ȡ�
	 * 
	 * ���صĳ�����Ҫ��С�������С�
	 * 
	 * ʾ����
	 * 
	 * ���룺 shorter = 1 longer = 2 k = 3 ����� {3,4,5,6} ��ʾ��
	 * 
	 * 0 < shorter <= longer 0 <= k <= 100000
	 * 
	 * ��Դ�����ۣ�LeetCode�� ���ӣ�https://leetcode-cn.com/problems/diving-board-lcci
	 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
	 */

	public static void main(String[] args) {

	}

	public int[] divingBoard(int shorter, int longer, int k) {

		if (k == 0)
			return new int[] {};
		if (shorter == longer)
			return new int[] { shorter * k };
		int min = shorter * k, gap = longer - shorter, num = k + 1;
		int[] res = new int[num];
		for (int i = 0; i < num; i++) {
			res[i] = min + gap * i;
		}
		return res;
	}

	// ������3 �ֿ��ܣ���ľ�壬����һ�£��ձ����

}
