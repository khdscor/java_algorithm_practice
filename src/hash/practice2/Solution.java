package hash.practice2;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String compare="";

        exit:for(int length=1;length<20;length++) {

            for (String i : phone_book) {

                if (i.length() == length) {
                    compare = i;
                    for (String j : phone_book) {
                        if (i == j)
                            continue;
                        if (j.indexOf(i)==0) {

                            answer = false;
                            break exit;
                        }
                    }
                }
            }
        }


        return answer;
    }
}
