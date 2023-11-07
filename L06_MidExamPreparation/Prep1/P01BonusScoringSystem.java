package L06_MidExamPreparation.Prep1;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int courseLectureCount = Integer.parseInt(scanner.nextLine());
        int courseBonus = Integer.parseInt(scanner.nextLine());

        double maxBonusStudent = Double.MIN_VALUE;
        int studentMaxBonus = 0;
        for (int i = 0; i < students; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());

            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            double bonusCurrentStudent = studentAttendance * 1.0 / courseLectureCount * (5 + courseBonus);
            if (bonusCurrentStudent > maxBonusStudent) {
                maxBonusStudent = bonusCurrentStudent;
                studentMaxBonus = studentAttendance;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonusStudent);
        System.out.printf("The student has attended %d lectures.", studentMaxBonus);

    }
}
