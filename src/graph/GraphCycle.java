package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GraphCycle {

    final static boolean[][] ADJACENCY = {
            {false, false, false, false, true},
            {false, false, true, true, false },
            {false, true, false, true, true},
            {false, true ,true , false, true},
            {true, false, true, true, false},
    };

    static boolean[] VISITED = new boolean[ADJACENCY.length];
    static Stack<Integer> s = new Stack<Integer>();

    public static boolean isCycle(int value){

        boolean isCycle = false;
        s.add(value);

        while(!s.isEmpty()){

            int current = s.pop();
            for(int i = 0 ; i< ADJACENCY[current].length; i++){
                if(ADJACENCY[current][i] && !VISITED[i]){
                    s.push(i);
                }
            }
            //cycle.add(current);
            if(VISITED[current]){
                isCycle = true;
            }else{
                VISITED[current] = true;
            }

        }

        return isCycle;

    }

    public static String testStr(){

        String test = "this";
        String result = "";
        for(int i = 1 ; i <= test.length(); i ++){

            result += test.substring(test.length() - i , test.length() - i +1);
        }

        return result;

    }

    public static void main(String[] args){

       // String test = "abcdefghijk";

        //System.out.println(new StringBuilder("abcdefghijk").reverse());
        //System.out.println("test1".substring(3, 4));

        System.out.println(testStr());
        //System.out.println("this is test!".substring(13, 0));
        //System.out.println(testStr());

    }
}
