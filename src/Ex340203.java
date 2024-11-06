import java.util.Arrays;

public class Ex340203 {

    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] cpr = {"respiration", "repeat", "check", "pressure", "call"};

        int[] awr = solution(cpr);

        System.out.println(Arrays.toString(awr));
    }

}
