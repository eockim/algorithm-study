package graph;

import java.util.LinkedList;
import java.util.Queue;

public class SampleBfs {


    final static boolean[][] ADJACENCY = {
            {false, false, false, false, true},
            {false, false, true, true, false },
            {false, true, false, true, true},
            {false, true ,true , false, true},
            {true, false, true, true, false},
    };

    static boolean[] VISITED = new boolean[ADJACENCY.length];


    static Queue<Integer> q = new LinkedList<Integer>();

    public static void bfs(int value){

        q.add(value);
        VISITED[value] = true;

        while(!q.isEmpty()){

            int poll = q.poll();
            System.out.println("poll : " + poll);

            for(int i = 0 ; i < ADJACENCY.length; i ++){
                if(ADJACENCY[poll][i] && !VISITED[i]){
                    q.add(i);
                    VISITED[i] = true;
                }
            }

        }

    }

    public static void main(String[] args){
        bfs(0);
    }
}
