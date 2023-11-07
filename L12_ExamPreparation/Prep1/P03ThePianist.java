package L12_ExamPreparation.Prep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03ThePianist {
    static class Piece {
        String pieceName;
        String composer;
        String key;

        public Piece(String pieceName, String composer, String key) {
            this.pieceName = pieceName;
            this.composer = composer;
            this.key = key;
        }

        public String getPieceName() {
            return pieceName;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.pieceName, this.composer, this.key);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Piece> piecesList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\|");
            Piece piece = new Piece(command[0], command[1], command[2]);
            piecesList.add(piece);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Stop")){
            String[] commands = commandLine.split("\\|");
            String pieceAction = commands[1];

            switch (commands[0]){
                case "Add":
                    boolean isContaining = false;
                    for (Piece piece : piecesList) {
                        if (piece.getPieceName().equals(pieceAction)){
                            System.out.println(pieceAction + " is already in the collection!");
                            isContaining = true;
                            break;
                        }
                    }
                    if (!isContaining){
                        piecesList.add(new Piece(pieceAction,commands[2], commands[3]));
                        System.out.printf("%s by %s in %s added to the collection!%n",pieceAction, commands[2], commands[3]);
                    }
                    break;
                case "Remove":
                    boolean isRemoved = false;
                    for (Piece piece : piecesList) {
                        if (piece.getPieceName().equals(pieceAction)){
                            piecesList.remove(piece);
                            System.out.println("Successfully removed " + pieceAction + "!");
                            isRemoved = true;
                            break;
                        }
                    }
                    if (!isRemoved){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceAction);
                    }
                    break;
                case "ChangeKey":
                    boolean isChanged = false;

                    for (Piece piece : piecesList) {
                        if (piece.getPieceName().equals(pieceAction)){
                            piece.setKey(commands[2]);
                            System.out.printf("Changed the key of %s to %s!%n", pieceAction, commands[2]);
                            isChanged = true;
                            break;
                        }
                    }
                    if (!isChanged){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceAction);
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }

        piecesList.forEach(e -> System.out.println(e.toString()));

    }
}
