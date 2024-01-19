package 대소문자;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        char alpha;
        //입력받은 string을 character 단위로 받아준다.
        for(int i=0;i<a.length();i++){

            //toCharArray를 모르고 삽질하다가 고친 코드.
            alpha = a.toCharArray()[i];

            // character를 아스키코드로 알파벳 대소문자 구분. 65~90은 A~Z , 97~122는 a~z
            if(alpha>96&&alpha<123){
                answer+=(char)(alpha-32);
            }
            else{
                answer+=(char)(alpha+32);
            }
        }
        System.out.println(answer);


    }


}
