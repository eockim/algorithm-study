package code;

public class Airport {

    public int chooseCity(int n, int [][]city){
        int answer = 0;
        int min = 0;
        for(int i = 0; i < n; i++){

            int tmp = 0;
            if(i == 0){
                min = tmp;
                answer = city[0][0];
            }

            int j = 0;
            while(j < n){
                if(i != j){
                    tmp += Math.abs(city[j][0] - city[i][0])* city[j][1];
                }
                if(tmp > min && i != 0) break;
                j++;
            }
//            for(int j = 0 ; j < city.length; j ++){
//                if(i != j){
//                    tmp += Math.abs(city[j][0] - city[i][0]) * city[j][1];
//                }
//                if(tmp > min && i != 0) {
//                    break;
//                }
//            }

            if(i == 0) min = tmp;

            System.out.println("tmp : " + tmp);;
            System.out.println("min : " + min);

            if(tmp < min){
                min = tmp;
                answer = city[i][0];
            }
         }

        return answer;
    }

    public static void main(String[] args){

        Airport test = new Airport();
        int tn = 4;
        int [][]tcity = {{-2,5},{-100, 2},{3,3}, {0, 3}};
        System.out.println(test.chooseCity(tn,tcity));

    }
}
