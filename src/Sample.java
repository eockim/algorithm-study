public class Sample {

    public static void main(String[] args){

        byte b = (byte) (300);
        byte[] bArray = {(byte)0, (byte)255, (byte)123,(byte)12,(byte)2, (byte)4,(byte)12, (byte)4, (byte)55,(byte)2};
        System.out.println(b & 0xff);


        System.arraycopy(bArray,0, bArray, 5, 2 );

        for(int i = 0 ; i < bArray.length; i ++){
            System.out.print((bArray[i]&0xff) + " ");
        }
    }
}
