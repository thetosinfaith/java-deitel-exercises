package Exercises;
import java.util.ArrayList;

public class LearningArrayAndArrayList {
    public static void main(String[] args) {

        int[] studentScore = new int[12];

        studentScore[0] = 34;
        studentScore[1] = 44;
        studentScore[2] = 25;
        studentScore[3] = 44;
        studentScore[4] = 80;

        String[] studentNames = new String[5];
        studentNames[0] = "Faith";
        studentNames[1] = "Ade";
        studentNames[2] = "Bayo";
        studentNames[3] = "Lucia";

        for (int i = 0; i < studentScore.length; i++) {
            System.out.println(studentScore[i]);

            for (int j = 0; j < studentNames.length; j++) {
                System.out.println(studentNames[j]);

                ArrayList<String> teacherName = new ArrayList<>();
                teacherName.add("Ade");
                teacherName.add("Glory");
                teacherName.add("Joy");
                teacherName.add("Musa");
                teacherName.add("Matthew");

                teacherName.contains("musa");
                teacherName.clear();

                for (int k = 0; k < teacherName.size(); k++) {
                    System.out.printf(teacherName.get(k));

                }

            }
        }

    }

}


