package code;

public class Tiling {

    public int tiling(int n) {
        int answer = 0;

        return (int)Math.pow(2, n);
    }

    public static void main(String args[]) {
        Tiling tryHelloWorld = new Tiling();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.print(tryHelloWorld.tiling(2));
    }

}
