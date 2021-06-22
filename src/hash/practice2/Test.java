package hash.practice2;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42577?language=java


public class Test {

    public static void main(String[] args) {

        String[] test1= new String[3];
        test1[0]="119";
        test1[1]="97674223";
        test1[2]="1195524421";

        Solution result= new Solution();

        System.out.println(result.solution(test1));

    }


}
