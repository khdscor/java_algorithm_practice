package hash.practice1;
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "dassda";

        HashMap<String, Integer > participantList = new HashMap<String, Integer>();
        for(String i: participant){
            if(participantList.containsKey(i)) {
                participantList.put(i, participantList.get(i) + 1);
                continue;
            }
            participantList.put(i,1);
        }

        for(String i:completion){
            participantList.put(i, participantList.get(i) - 1);
        }

        for(String i: participant) {
            if (participantList.get(i) >= 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
