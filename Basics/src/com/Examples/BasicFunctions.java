package com.Examples;

public class BasicFunctions {

    public boolean isOdd(int number){
        return (number & 1) == 1;
    }


    public int getBitAtParticularIndex(int number, int index){
        return (number & (1 << (index - 1)));
    }

    // input arr = {1, 2, 3, 2, 1}
    public int findUniqueNumber(int[] arr) {
        int ans = 0;
        for(int i: arr){
            ans ^= i;
        }

        return ans;
    }

    public int findMagicNumber(int number){
        int sum = 0, i = 1;
        while(number != 0){
            if((number & 1) == 1){
                sum += Math.pow(5,i);

            }
            i++;
            number >>= 1;
        }
        return sum;
    }

    public int findDigitsInNumber(int number){
        return (int)Math.log10(number) + 1;
    }

    public int findSumOfnthRowInPascal(int number){
        return 1 << (number - 1);
    }


    public boolean checkIfPowerOfTwo(int number){
        while(number > 1){
            if((number & 1) != 0){
                return false;
            }
            number >>= 1;
        }
        return true;
    }

    public boolean checkIfPowerOfTwo2(int number){
        return (number & (number - 1)) == 0;
    }

    public long power(int base, int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }


    public int setBits(int number){
        int count = 0;
//        while(number > 0){
//            count++;
//            number -= (number & -number);
//        }

        while(number > 0){
            count++;
            number &= (number - 1);
        }
        return  count;
    }

    public int xor(int number){
        if(number % 4 == 0){
            return number;
        }else if(number % 4 == 1){
            return 1;
        }else if(number % 4 == 2){
            return number + 1;
        }else{
            return 0;
        }
    }

    public int xorInRange(int start, int end){
        return xor(end) ^ xor(start - 1);
    }



}
