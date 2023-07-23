package math;

import java.util.*;
import java.util.stream.IntStream;

public class Operations {
    public void add() {
        System.out.println("**************************Addition**********************");
        String addFormat = "%s + %s = %s";
        List<String> CorrectAnswer = new ArrayList<>();
        List<String> WrongAnswer = new ArrayList<>();
        int wrongCount = 0;
        System.out.println("Addition 1 to 10");
        List<Integer> firstNumber = new ArrayList<Integer>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> secondNumber = new ArrayList<>(List.copyOf(firstNumber));
        Collections.shuffle(firstNumber);
        Collections.shuffle(secondNumber);
        for (int first : firstNumber) {
            for (int second : secondNumber) {
                int attempt = 1;
                String message = String.format(addFormat, first, second, "");
                System.out.print(message);
                Scanner myInput = new Scanner(System.in);
                int providedAnswer;
                while (true) {
                    try {
                        providedAnswer = myInput.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Answer can only be a number Chriselda!");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        attempt++;
                    }
                }
                if (first + second != providedAnswer) {
                    while (true) {
                        String wrongMessage = String.format(addFormat, first, second, providedAnswer);
                        System.out.println(wrongMessage + " is wrong, please try again Chriselda");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        while (true) {
                            try {
                                providedAnswer = myInput.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Answer can only be a number Chriselda!");
                                System.out.print(message);
                                myInput = new Scanner(System.in);
                            }
                        }
                        if (first + second == providedAnswer) {
                            break;
                        }
                    }
                } else {
                    if (!(attempt > 1)) {
                        System.out.println(Phrases.getRandomEncouragingWord());
                    }
                }
            }
        }
        System.out.println("Good Job in Finishing Addition Chrissy! ");
        System.out.println(Phrases.getRandomEncouragingWord());
    }

    public void subtract() {
        System.out.println("**************************Subtraction**********************");
        String addFormat = "%s - %s = %s";
        List<String> CorrectAnswer = new ArrayList<>();
        List<String> WrongAnswer = new ArrayList<>();
        int wrongCount = 0;
        System.out.println("Subtraction 1 to 10");
        List<Integer> firstNumber = new ArrayList<Integer>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> secondNumber = new ArrayList<>(List.copyOf(firstNumber));
        Collections.shuffle(firstNumber);
        Collections.shuffle(secondNumber);
        for (int first : firstNumber) {
            for (int second : secondNumber) {
                int attempt = 1;
                if (first - second < 0) {
                    continue;
                }
                String message = String.format(addFormat, first, second, "");
                System.out.print(message);
                Scanner myInput = new Scanner(System.in);
                int providedAnswer;
                while (true) {
                    try {
                        providedAnswer = myInput.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Answer can only be a number Chriselda!");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        attempt++;
                    }
                }
                if (first - second != providedAnswer) {
                    while (true) {
                        String wrongMessage = String.format(addFormat, first, second, providedAnswer);
                        System.out.println(wrongMessage + " is wrong, please try again Chriselda");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        while (true) {
                            try {
                                providedAnswer = myInput.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Answer can only be a number Chriselda!");
                                System.out.print(message);
                                myInput = new Scanner(System.in);
                            }
                        }
                        if (first - second == providedAnswer) {
                            break;
                        }
                    }
                } else {
                    if (!(attempt > 1)) {
                        System.out.println(Phrases.getRandomEncouragingWord());
                    }
                }
            }
        }
        System.out.println("Good Job in Finishing Subtraction Chrissy! ");
        System.out.println(Phrases.getRandomEncouragingWord());
    }

    public void multiply() {
        System.out.println("**************************Addition**********************");
        String addFormat = "%s * %s = %s";
        List<String> CorrectAnswer = new ArrayList<>();
        List<String> WrongAnswer = new ArrayList<>();
        int wrongCount = 0;
        System.out.println("Multiplication 1 to 10");
        List<Integer> firstNumber = new ArrayList<Integer>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> secondNumber = new ArrayList<>(List.copyOf(firstNumber));
        Collections.shuffle(firstNumber);
        Collections.shuffle(secondNumber);
        for (int first : firstNumber) {
            for (int second : secondNumber) {
                int attempt = 1;
                String message = String.format(addFormat, first, second, "");
                System.out.print(message);
                Scanner myInput = new Scanner(System.in);
                int providedAnswer;
                while (true) {
                    try {
                        providedAnswer = myInput.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Answer can only be a number Chriselda!");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        attempt++;
                    }
                }
                if (first * second != providedAnswer) {
                    while (true) {
                        String wrongMessage = String.format(addFormat, first, second, providedAnswer);
                        System.out.println(wrongMessage + " is wrong, please try again Chriselda");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        while (true) {
                            try {
                                providedAnswer = myInput.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Answer can only be a number Chriselda!");
                                System.out.print(message);
                                myInput = new Scanner(System.in);
                            }
                        }
                        if (first * second == providedAnswer) {
                            break;
                        }
                    }
                } else {
                    if (!(attempt > 1)) {
                        System.out.println(Phrases.getRandomEncouragingWord());
                    }
                }
            }
        }
        System.out.println("Good Job in Finishing Multiplication Chrissy! ");
        System.out.println(Phrases.getRandomEncouragingWord());
    }

    public void divide() {
        System.out.println("**************************Subtraction**********************");
        String addFormat = "%s / %s = %s";
        List<String> CorrectAnswer = new ArrayList<>();
        List<String> WrongAnswer = new ArrayList<>();
        int wrongCount = 0;
        System.out.println("Division 1 to 20 divided by 1 to 20");
        List<Integer> firstNumber = new ArrayList<Integer>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        List<Integer> secondNumber = new ArrayList<>(List.copyOf(firstNumber));
        Collections.shuffle(firstNumber);
        Collections.shuffle(secondNumber);
        for (int first : firstNumber) {
            for (int second : secondNumber) {
                int attempt = 1;
                if (first < second || first % second != 0) {
                    continue;
                }
                String message = String.format(addFormat, first, second, "");
                System.out.print(message);
                Scanner myInput = new Scanner(System.in);
                int providedAnswer;
                while (true) {
                    try {
                        providedAnswer = myInput.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Answer can only be a number Chriselda!");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        attempt++;
                    }
                }
                if (first / second != providedAnswer) {
                    while (true) {
                        String wrongMessage = String.format(addFormat, first, second, providedAnswer);
                        System.out.println(wrongMessage + " is wrong, please try again Chriselda");
                        System.out.print(message);
                        myInput = new Scanner(System.in);
                        while (true) {
                            try {
                                providedAnswer = myInput.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Answer can only be a number Chriselda!");
                                System.out.print(message);
                                myInput = new Scanner(System.in);
                            }
                        }
                        if (first / second == providedAnswer) {
                            break;
                        }
                    }
                } else {
                    if (!(attempt > 1)) {
                        System.out.println(Phrases.getRandomEncouragingWord());
                    }
                }
            }
        }
        System.out.println("Good Job in Finishing Division Chrissy! ");
        System.out.println(Phrases.getRandomEncouragingWord());
    }

    public void learnMultiplication(int a){
        System.out.println("**************************Learn Multiplication**********************");
        String addFormat = "%s * %s = %s";
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println(String.format(addFormat,i,a,a*i)));
        System.out.println("Happy Learning Chriselda! ");
    }

    public static void main(String args[]) {
        String break_15_mins = "Take a break for 15 mins";
        Operations op = new Operations();
        boolean option = true;
        while (option) {
            System.out.println("Math Fun: Welcome Chriselda!!!");
            System.out.println("What do you want to do?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. All");
            System.out.println("6. Exit");
            System.out.print("Please Enter Your Option: ");
            Scanner myInput = new Scanner(System.in);
            int input;
            while (true) {
                try {
                    input = myInput.nextInt();
                    if(input<1 || input>6){
                        throw new Exception("Option Should be between 1 and 6 Chriselda");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Option Should be between 1 and 6 Chriselda");
                    System.out.print("Please Enter Your Option: ");
                    myInput = new Scanner(System.in);
                }
            }

            switch (input) {
                case 1:
                    op.add();
                    break;
                case 2:
                    op.subtract();
                    break;
                case 3:

                    Scanner multiplicationInput = new Scanner(System.in);
                    System.out.println("1. Learn Tables");
                    System.out.println("2. Answer Questions");
                    System.out.println("3. Exit Multiplication");
                    System.out.print("Please choose your option: ");
                    int multiplicationInputInt;
                    while (true) {
                        try {
                            multiplicationInputInt = multiplicationInput.nextInt();
                            if(multiplicationInputInt==3){
                                break;
                            }
                            if(multiplicationInputInt==1){
                                System.out.print("Which Table You want to learn, Enter 0 to exit learning Tables: ");
                                Scanner tableToLearn = new Scanner(System.in);
                                while(true){
                                    try{
                                        int tableInput = tableToLearn.nextInt();
                                        if(tableInput==0){
                                            break;
                                        }
                                        op.learnMultiplication(tableInput);
                                        System.out.print("Which Table You want to learn, Enter 0 to exit learning Tables: ");
                                    }
                                    catch (Exception e){
                                        System.out.println("Please Enter a Valid Number Chriselda");
                                        System.out.print("Which Table You want to learn, Enter 0 to exit learning Tables: ");
                                        tableToLearn = new Scanner(System.in);
                                    }
                                }

                            }
                            else if(multiplicationInputInt==2){
                                op.multiply();
                            }
                            if(multiplicationInputInt<1 || input>2){
                                throw new Exception("Please choose Option 1 or 2 Chriselda");
                            }
                            break;
                        } catch (Exception e) {
                            System.out.println("Please choose Option 1 to 3 Chriselda");
                            System.out.println("1. Learn Tables");
                            System.out.println("2. Answer Questions");
                            System.out.println("3. Exit Multiplication");
                            System.out.print("Please choose your option: ");
                            myInput = new Scanner(System.in);
                        }
                    }
                    break;
                case 4:
                    op.divide();
                    break;
                case 5:
                    op.add();
                    System.out.println(break_15_mins);
                    op.subtract();
                    System.out.println(break_15_mins);

                    op.multiply();
                    System.out.println(break_15_mins);
                    op.divide();
                    System.out.println("Amazing Chriselda. You Did it All. You deserve a Treat!!!!");
                    break;
                case 6:
                    option = false;
                    break;
                default:
                    System.out.println("Option Should be between 1 and 6 Chriselda");
            }
        }
    }
}
