package code;

public class Str237 {

    int i , r[] = new int[238];
    int str237(String s){
        r[0] = 1;
        for(int c : s.getBytes()){
            for(i = 238; i-- > c;){
                r[i] += r[i - c];
            }
        }
        return r[237];
    }

    public static void main(String[] args) {

    }
}
