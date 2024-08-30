package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //funcion ordenar palabras
    private static String reorderSentence(String[] words) {
        String[] wordsOrdenated = new String[words.length + 1];
        String wordComplete= "";

        for (int i = 0; i < words.length; i++) {

            int position = Character.getNumericValue(words[i].charAt(words[i].length() - 1));

            String wordExcludeNum = "";

            for (int j = 0; j < words[i].length() - 1; j++) {
                wordExcludeNum += words[i].charAt(j);
            }

            wordsOrdenated[position] = wordExcludeNum;

        }

        for (int i = 0; i < wordsOrdenated.length; i++) {
            if(wordsOrdenated[i] != null){
                wordComplete += wordsOrdenated[i].trim() + " ";
            }
        }

        return wordComplete.trim();
    }

    //funcion fucionar y ordenar numeros
    private static int[] mergeAndSort(int[] nums1, int[] nums2) {
        int numerosOrdenados[] = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length + nums2.length; i++) {

            if(i < nums1.length){
                numerosOrdenados[i] = nums1[i];
            }

            if(i >= nums1.length){
                numerosOrdenados[i] = nums2[i - nums1.length];
            }
        }

        Arrays.sort(numerosOrdenados);

        return numerosOrdenados;
    }

    public static void main(String[] args) {
        //problema 1
        String[] words = {"esta2", "bien4", "muy3", "esto1"};

        String result = reorderSentence(words);

        System.out.println("Resultado 1: "+result);

        //problema 2
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        int[] result2 = mergeAndSort(nums1, nums2);

        System.out.println("Resultado 2: "+Arrays.toString(result2));
    }
}