package code;

import java.util.stream.IntStream;

public class GetMean {
    public int getMean(int[] array) {
    	
        return IntStream.of(array).parallel().sum()/array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}