package com.julianne.strings;

public class TextProcessor3 {

    public static void main(String[] args) {

        addSpaces("HeyWorld!It'sMeAngie");
    }

    private static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);
        for(int i = 0; i < modifiedText.length(); i++) {
            // not the first character and is upper case on the position of the index
            if(i !=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                // insert a space before the index
                modifiedText.insert(i," ");
                // with the inserted space we are messing the numbers up so we fix it with ++
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
