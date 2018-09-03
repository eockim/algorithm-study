public class Sample {

    public static void main(String[] args){

        StringBuilder b1 = new StringBuilder("test");
        StringBuilder b2 = b1;
        b2.append(" b2");
        b1.append(" b1");

        System.out.println(b1);
        System.out.println(b2);

        String s1 = "s1";
        String s2 = s1;
        s2 += "a";

        System.out.println(s1);
        System.out.println(s2);

    }

}
