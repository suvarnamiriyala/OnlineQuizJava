import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== ONLINE QUIZ STARTED =====");

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().charAt(0);

            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    public void showResult() {
        System.out.println("\n===== QUIZ COMPLETED =====");
        System.out.println("Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("Excellent performance!");
        } else if (score >= questions.size() / 2) {
            System.out.println("Good job!");
        } else {
            System.out.println("Needs improvement.");
        }
    }
}
