package HashMap_Exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

class Student {

    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        Map<String, Double> maxMarks = new HashMap<>();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }

            if (entry.getValue() < min) {
                min = entry.getValue();
            }

        }

        for (Entry<String, Double> marks : studentMarks.entrySet()) {
            if (marks.getValue() == max) {
                maxMarks.put(marks.getKey(), marks.getValue());

            }

            if (marks.getValue() == min) {
                maxMarks.put(marks.getKey(), marks.getValue());
            }
        }

        // Implement your logic here and change the return statement accordingly
        return maxMarks;
    }

}

class Tester {

    public static void main(String args[]) {
        Map<String, Double> studentMarks = new HashMap<String, Double>();
        studentMarks.put("Lily", 90.0);
        studentMarks.put("Robin", 68.0);
        studentMarks.put("Marshall", 76.5);
        studentMarks.put("Neil", 67.0);
        studentMarks.put("Ted", 92.0);

        Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);

        System.out.println("Details of Top Scorers & Low Scorers\n====================================");
        for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}
