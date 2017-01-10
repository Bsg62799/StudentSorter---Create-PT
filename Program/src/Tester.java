import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by bsg27 on 12/8/2016.
 */
public class Tester {
    public static void main(String args[]) {

        //vars
        int groupAmount, random, remainder, remainderValue, groupSize, check = 0;
        ArrayList<Integer> studentArray = new ArrayList<Integer>();
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        String studentsString, groupString;

        //initialize random
        Random rng = new Random();

        //request number of students
        studentsString = JOptionPane.showInputDialog(null,
                "Enter number of students",
                "Student Sorter", JOptionPane.QUESTION_MESSAGE);

        //request group size
        groupString = JOptionPane.showInputDialog(null,
                "Enter desired number of groups",
                "Student Sorter", JOptionPane.QUESTION_MESSAGE);
        groupSize = Integer.parseInt(groupString);

        //calculate number of groups and any remainders
        groupAmount = Integer.parseInt(studentsString) / Integer.parseInt(groupString);
        remainder = Integer.parseInt(studentsString) % Integer.parseInt(groupString);



        //initialize groupsArray
        int[][] groupsArray = new int[groupAmount][Integer.parseInt(groupString)];

        //construct studentArray
        for (int i = 1; i <= Integer.parseInt(studentsString); i++) {
            studentArray.add(i);
        }

        //randomize randomArray
        for (int i = 1; i <= Integer.parseInt(studentsString); i++) {
            random = rng.nextInt(studentArray.size());
            randomArray.add(studentArray.get(random));
            studentArray.remove(random);
        }

        //print group titles
        for(int i = 0; i < groupSize; i++){System.out.print("Group " + (i + 1) + "   ");}
        System.out.println("");

        //print randomArray
        for (int i = 0; i < randomArray.size(); i++) {

            System.out.print(randomArray.get(i));
            if (randomArray.get(i) / 10 >= 1) System.out.print("      | ");
            else System.out.print("       | ");



            if((i + 1) % groupSize  == 0 && i != 0){
                System.out.println("");
                remainder--;
            }


        }

    }}

