package DFS.practice1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/43162

public class Test {

    public static void main(String[] args) {

        int[][] computers= new int[3][3];
        computers[0][0]=1;
        computers[0][1]=1;
        computers[0][2]=0;
        computers[1][0]=1;
        computers[1][1]=1;
        computers[1][2]=0;
        computers[2][0]=0;
        computers[2][1]=0;
        computers[2][2]=1;

        Solution test =new Solution();
        System.out.println(test.solution(3,computers));
    }

}
