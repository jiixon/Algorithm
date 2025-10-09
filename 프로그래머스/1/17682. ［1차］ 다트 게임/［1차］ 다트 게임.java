import java.util.*;
class Solution {
    public int solution(String dartResult) {
        char[] arr = dartResult.toCharArray();
        int[] score = new int[3];
        
        int idx = 0;
        int n = 0;
        for(int i = 0; i<arr.length; i++){
            //점수 계산
            if(Character.isDigit(arr[i])){
                //10 점수인 경우
                if(arr[i] == '1' && arr[i+1] == '0'){
                    n = 10;
                    i++;
                    
                }else{ //0~9 점수인 경우
                    n = arr[i] - '0'; //숫자로 변환
                }
            }
            
            //보너스 계산 후 배열에 저장
            else if(arr[i] == 'S') score[idx++] = n;
            else if(arr[i] == 'D') score[idx++] = n*n;
            else if(arr[i] == 'T') score[idx++] = n*n*n;
            
            //옵션 계산
            else if(arr[i] == '*') {
                score[idx-1] *= 2;
                if (idx>1) score[idx-2] *= 2;
            }
            else if(arr[i] == '#') {
                score[idx-1] *= -1;
            }
        }
        return score[0] + score[1] + score[2];
    }
}