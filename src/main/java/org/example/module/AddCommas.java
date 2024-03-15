package org.example.module;

public class AddCommas {
    public String addComma(Long price){
        String pToString = String.valueOf(price);
        StringBuilder result = new StringBuilder();

        int count = 0;
        for(int i = pToString.length() - 1; i >= 0; i--){
            if(count % 3 == 0 && count != 0){
                result.append(",");
            }
            result.append(pToString.charAt(i));
            count++;
        }
        return result.reverse().toString();
    }
}
