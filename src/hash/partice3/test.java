package hash.partice3;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42578

public class test {

    public static void main(String[] args) {

        String[][] test= {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution result= new Solution();
        int answer = result.solution(test);
        System.out.println(answer);
    }

}
