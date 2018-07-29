package code;

public class Change {

    public int change(int total, int[] coins) {

        int[] c = new int[total + 1];

        for(int i = 0; i < coins.length; i++){

            c[coins[i]]++;
            for(int j = 0; coins[i] + j <= total; j++){
                c[coins[i] + j] += c[j];
            }
        }
        return c[total];

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Change c = new Change();
        int[] coins = { 1, 2, 5 };
        System.out.println(c.change(5, coins));
    }

}
