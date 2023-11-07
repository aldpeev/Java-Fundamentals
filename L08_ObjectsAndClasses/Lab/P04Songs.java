package L08_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song {
        String listType;
        String name;
        String time;

        public Song(String listType, String name, String time) {
            this.listType = listType;
            this.name = name;
            this.time = time;
        }

        public String getListType() {
            return this.listType;
        }

        public String getName() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] songData = scanner.nextLine().split("_");

            Song currentSong = new Song(songData[0], songData[1], songData[2]);
            songList.add(currentSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song el : songList) {
                System.out.println(el.getName());
            }
        } else {
            for (Song el: songList){
                if (el.getListType().equals(command)){
                    System.out.println(el.getName());
                }
            }

        }

    }
}
