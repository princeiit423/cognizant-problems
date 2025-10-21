import java.util.ArrayList;
import java.util.Collections;

public class job_sequence_22 {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int d, int p, int i) {
            deadline = d;
            profit = p;
            id = i;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        // 4 -> job deadline and 20 -> profit

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        // desending order profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print sewuence
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }

    }
}
