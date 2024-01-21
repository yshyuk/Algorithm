package 콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        // 빈 병 a개를 가져다주면 콜라 b병 ,
        int i = n;
        int remain = 0;
        while(i>b){
            remain = i%a;
            i= (i/a)*b;
            answer+=i;
            if(i>=b)
            i+=remain;
        }
        return answer;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int answer1 = sol.solution(3,1,20);
        System.out.println(answer1);
    }
}
