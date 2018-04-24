package code;

public class BigSquare {

    public int findLargestSquare(char [][]board){
        int answer = 0;
        int[][] memorize = new int[board.length][board[0].length];

        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[i].length; j++){
                if(board[i][j] == 'O'){
                    memorize[i][j] = 1;
                }else{
                    memorize[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < memorize.length; i++){

            for(int j = 1; j < memorize[i].length; j++){

                if(memorize[i][j] == 0){
                    continue;
                }else if(memorize[i][j-1] > 0 && memorize[i-1][j] > 0 && memorize[i-1][j-1] > 0){

                    memorize[i][j] = Math.min( memorize[i][j-1], Math.min(memorize[i-1][j], memorize[i-1][j-1])) + 1;
                    if(memorize[i][j] > answer){
                        answer = memorize[i][j];
                    }

                }

            }
        }
        return answer * answer;

    }
    public static void main(String[] args){
        BigSquare test = new BigSquare();
        char [][]board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','O','O','O','O'},
                {'X','O','O','O','O'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'}
        };
        System.out.println(test.findLargestSquare(board));

    }
}
