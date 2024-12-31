/*
 * 202. Happy Number
*/
bool isHappy(int n) {
    int  num = 0, sum = 0;

    while(n > 0){
        num = n % 10;
        sum = sum + (num * num);
        n = n / 10;
    }
    if(sum == 1 || sum == 7){
        return 1;
    }
    else if(sum < 10){
        return 0;
    }
    else{
       return isHappy(sum);
    }
}
