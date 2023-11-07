package edu.desu.reverse;

public class Reverse {

    public String wordRev(String input){
        if(input == null || input.length() <=1){
            return input;
        }
        char lastChar = input.charAt(input.length()-1);
        String subString = input.substring(0, input.length()-1);
        return lastChar + wordRev(subString);
    }
}
