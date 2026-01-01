public class Main {

    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
                "What is the capital of India?",
                new String[]{"Delhi", "Mumbai", "Chennai", "Kolkata"},
                'A'
        ));

        quiz.addQuestion(new Question(
                "Which language is platform independent?",
                new String[]{"C", "C++", "Java", "Python"},
                'C'
        ));

        quiz.addQuestion(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"this", "super", "extends", "implements"},
                'C'
        ));

        quiz.addQuestion(new Question(
                "Which collection does not allow duplicates?",
                new String[]{"List", "Set", "Map", "ArrayList"},
                'B'
        ));

        quiz.startQuiz();
        quiz.showResult();
    }
}
