package com.programmers.sort;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameAlignment {

    public String[] main(String[] files) {
        Solution_FileNameAlignment processCommand = new Solution_FileNameAlignment();
        return processCommand.solution(files);
    }
}

class Solution_FileNameAlignment{

    public static class File implements Comparable<File>{

        private String fileName;
        private int enteredOrder;

        public File(String fileName, int enteredOrder){
            this.fileName = fileName;
            this.enteredOrder = enteredOrder;
        }

        @Override
        public int compareTo(File temp){
            String header1 = getHeader(fileName);
            String header2 = getHeader(temp.fileName);
            if(header1.compareToIgnoreCase(header2) == 0){
                int number1 = getNumber(fileName);
                int number2 = getNumber(temp.fileName);
                if(number1 == number2){
                    return enteredOrder - temp.enteredOrder;
                }
                return number1 - number2;
            }
            return header1.compareToIgnoreCase(header2);
        }

        public String getHeader(String fileName){
            Pattern pattern = Pattern.compile("[\\D\\s.-]+");
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.find()){
                return matcher.group(0);
            }
            return null;
        }

        public int getNumber(String fileName){
            Pattern pattern = Pattern.compile("[0-9]{1,5}");
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.find()){
                return Integer.parseInt(matcher.group(0));
            }
            return -1;
        }
    }

    public String[] solution(String[] files){
        Queue<File> priorityQueue = new PriorityQueue<>();
        int index = 0;
        for(String file : files){
            priorityQueue.add(new File(file, index));
            index++;
        }
        String[] sortedFiles = new String[files.length];
        index = 0;
        while(!priorityQueue.isEmpty()){
            sortedFiles[index] = priorityQueue.poll().fileName;
            index++;
        }
        return sortedFiles;
    }

}
