package com.backjoon.combination;
/*
 * 다이어트
 * version 1.0
 * 2020.11.16
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon19942 {

    public static void main(String[] args) throws IOException {
        Solution_Backjoon19942 processCommand = new Solution_Backjoon19942();
        processCommand.solution();
    }

    public static String main(int materialCount, int[] min, int[][] material) {
        Solution_Backjoon19942 processCommand = new Solution_Backjoon19942();
        return processCommand.solution(materialCount, min, material);
    }

}

class Solution_Backjoon19942{

    public static class Material{
        private int protein;
        private int fat;
        private int carbohydrate;
        private int vitamin;
        private int price;
        public Material(int protein, int fat, int carbohydrate, int vitamin, int price){
            this.protein = protein;
            this.fat = fat;
            this.carbohydrate = carbohydrate;
            this.vitamin = vitamin;
            this.price = price;
        }
    }

    public static class Recipe{
        private final int PROTEIN_MIN;
        private final int FAT_MIN;
        private final int CARBOHYDRATE_MIN;
        private final int VITAMIN_MIN;
        public Recipe(int protein_min, int fat_min, int carbohydrate_min, int vitamin_min){
            this.PROTEIN_MIN = protein_min;
            this.FAT_MIN = fat_min;
            this.CARBOHYDRATE_MIN = carbohydrate_min;
            this.VITAMIN_MIN = vitamin_min;
        }
        public boolean isSatisfyMinMaterial(int protein, int fat, int carbohydrate, int vitamin){
            return protein >= PROTEIN_MIN && fat >= FAT_MIN
                        && carbohydrate >= CARBOHYDRATE_MIN && vitamin >= VITAMIN_MIN;
        }
    }

    public static class MaterialUnion implements Comparable<MaterialUnion>{
        private String union;
        private int sumOfPrice;
        public MaterialUnion(String union, int sumOfPrice){
            this.union = union;
            this.sumOfPrice = sumOfPrice;
        }
        @Override
        public int compareTo(MaterialUnion o) {
            if(this.sumOfPrice == o.sumOfPrice){
                return this.union.compareTo(o.union);
            }
            return sumOfPrice - o.sumOfPrice;
        }
    }

    private static final String impossibleCombination = "-1";

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Map<Integer, Material> materialMap = new HashMap<>();
    private Queue<MaterialUnion> materialUnionQueue = new PriorityQueue<>();
    private boolean[] visited;
    private Recipe recipe;
    private int materialCount;
    private boolean check = false;

    public void solution() throws IOException{
        materialCount = Integer.parseInt(br.readLine());
        visited = new boolean[materialCount];
        initRecipe();
        initMaterial();
        for(int i=0; i<=materialCount; i++){
            combination(0, 0, i);
        }
        print();
    }

    public String solution(int count, int[] min, int[][] material){
        materialCount = count;
        visited = new boolean[materialCount];
        recipe = new Recipe(min[0], min[1], min[2], min[3]);
        initMaterial(material);
        for(int i=0; i<=materialCount; i++){
            combination(0, 0, i);
        }
        return print();
    }

    public void initRecipe() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int protein_min = Integer.parseInt(st.nextToken());
        int fat_min = Integer.parseInt(st.nextToken());
        int carbohydrate_min = Integer.parseInt(st.nextToken());
        int vitamin_min = Integer.parseInt(st.nextToken());
        recipe = new Recipe(protein_min, fat_min, carbohydrate_min, vitamin_min);
    }

    public void initMaterial() throws IOException{
        for(int i=0; i<materialCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int protein = Integer.parseInt(st.nextToken());
            int fat = Integer.parseInt(st.nextToken());
            int carbohydrate = Integer.parseInt(st.nextToken());
            int vitamin = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            materialMap.put(i + 1, new Material(protein, fat, carbohydrate, vitamin, price));
        }
    }

    public void initMaterial(int[][] material) {
        for(int i=0; i<materialCount; i++){
            int protein = material[i][0];
            int fat = material[i][1];
            int carbohydrate = material[i][2];
            int vitamin = material[i][3];
            int price = material[i][4];
            materialMap.put(i + 1, new Material(protein, fat, carbohydrate, vitamin, price));
        }
    }

    public void combination(int index, int depth, int end){
        if(depth == end){
            doCommand();
            return;
        }
        for(int i=index; i<materialCount; i++){
            visited[i] = true;
            combination(i + 1, depth + 1, end);
            visited[i] = false;
        }
    }

    public void doCommand(){
        int sumOfProtein = 0;
        int sumOfFat = 0;
        int sumOfCarbohydrate = 0;
        int sumOfVitamin = 0;
        int totalPrice = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<materialCount; i++){
            if(visited[i]){
                Material temp = materialMap.get(i + 1);
                sumOfProtein += temp.protein;
                sumOfFat += temp.fat;
                sumOfCarbohydrate += temp.carbohydrate;
                sumOfVitamin += temp.vitamin;
                totalPrice += temp.price;
                sb.append(i + 1).append(" ");
            }
        }
        if(recipe.isSatisfyMinMaterial(sumOfProtein, sumOfFat, sumOfCarbohydrate, sumOfVitamin)){
            check = true;
            materialUnionQueue.add(new MaterialUnion(sb.toString(), totalPrice));
        }
    }

    public String print(){
        if(!check) {
            return impossibleCombination;
        }
        MaterialUnion temp = materialUnionQueue.poll();
        assert temp != null;
        return temp.sumOfPrice + "\n" + temp.union;
    }
}