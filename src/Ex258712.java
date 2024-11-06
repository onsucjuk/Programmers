public class Ex258712 { // 가장 많이 받은 선물

    public static int solution(String[] friends, String[] gifts) {

        int fLen = friends.length;
        int[][] now = new int[fLen][fLen];
        int[] send = new int[fLen];
        int[] get = new int[fLen];

        for (String gift : gifts) {

            String[] each = gift.split(" ");
            int idxI = 0;
            int idxJ = 0;

            for (int j = 0; j < fLen; j++) {
                if (each[0].equals(friends[j])) {
                    idxI = j;
                }
            }

            for (int j = 0; j < fLen; j++) {
                if (each[1].equals(friends[j])) {
                    idxJ = j;
                }
            }

            now[idxI][idxJ] += 1;
            send[idxI] += 1;
            get[idxJ] += 1;

        }



        int answer = 0;
        return answer;
    }



}
