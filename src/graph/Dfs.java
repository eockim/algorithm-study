package graph;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Dfs {

    final static boolean[][] ADJACENCY = {
            {false, false, false, false, true},
            {false, false, true, true, false },
            {false, true, false, true, true},
            {false, true ,true , false, true},
            {true, false, true, true, false},
    };

    static boolean[] VISITED = new boolean[ADJACENCY.length];


    public static void dfs(int value){


        VISITED[value] = true;
        System.out.println("value : " + value);
        for(int i = 0; i < ADJACENCY.length; i++ ){

            if(ADJACENCY[value][i] && !VISITED[i]){
                dfs(i);

            }
        }

    }

    public static void main(String[] args){

        dfs(0);

    }
}
