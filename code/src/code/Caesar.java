package code;

import java.util.Arrays;
import java.util.stream.Collectors;

class Caesar {
    String caesar(String s, int n) {

        String[] small = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z" };
        String[] large = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z" };
        String[] text = s.split(" ");
        String answer = "";
        for(int i = 0 ; i < text.length; i++){

           answer += text[i].chars().mapToObj(x -> {
                int index = 0;
                String result = "";
                if(Character.isUpperCase((char)x)){

                    index = (Arrays.asList(large).indexOf((char)x + "") + n%26)%26;
                    result = large[index];

                }else{

                    index = (Arrays.asList(small).indexOf((char)x +"") + n%26)%26;
                    result = small[index];

                }
                return result;
            })
            .collect(Collectors.joining()) + " ";

        }

        return answer.trim();
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("Wbof ovCokEErYCXAgRSrH IsMDLAjUjsfBKcFyd WcHDneno", 48));

    }
}
