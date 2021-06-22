package hash.practice1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42576


public class Test {

    public static void main(String[] args) {

        String[] test1= new String[3];
        test1[0]="leo";
        test1[1]="kiki";
        test1[2]="eden";

        String[] test2= new String[2];
        test2[0]="eden";
        test2[1]="kiki";

        Solution result= new Solution();

        System.out.println(result.solution(test1,test2));

    }


}
