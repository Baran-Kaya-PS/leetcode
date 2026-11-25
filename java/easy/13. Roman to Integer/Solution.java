class Solution {
    public int romanToInt(String s) {
        int nbTotal = 0;

        for (Integer i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    if (i+1 < s.length()){
                        if (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') {
                            break;
                        }
                    }
                    nbTotal +=1;
                    break;
                case 'V':
                    if (i != 0 && s.charAt(i-1) == 'I'){
                        nbTotal +=4;
                        break;
                    }
                    nbTotal +=5;
                    break;
                case 'X':
                    if (i+1 < s.length()) {
                        if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                            break;
                        }
                    }
                    if (i != 0 && s.charAt(i-1) == 'I'){
                        nbTotal +=9;
                        break;
                    }
                    else nbTotal +=10;
                    break;
                case 'L':
                    if (i != 0 && s.charAt(i-1) == 'X'){
                        nbTotal +=40;
                        break;
                    }
                    else nbTotal +=50;
                    break;
                case 'C':
                    if (i+1 < s.length()) {
                        if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                            break;
                        }
                    }
                    if (i != 0 && s.charAt(i-1) == 'X'){
                        nbTotal +=90;
                        break;
                    }
                    else nbTotal +=100;
                    break;
                case 'D':
                    if (i != 0 && s.charAt(i-1) == 'C'){
                        nbTotal +=400;
                        break;
                    }
                    else nbTotal +=500;
                    break;
                case 'M':

                    if (i != 0 && s.charAt(i-1) == 'C'){
                        nbTotal +=900;
                        break;
                    }
                    else nbTotal +=1000;
                    break;
            }
        }
        return nbTotal;
    }
}