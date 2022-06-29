package ObjectAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        String type;
        String name;
        String time;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songNumber = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < songNumber; i++) {
            String[] data = scanner.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();
            currentSong.setType(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songs.add(currentSong);
        }
        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (Song name : songs) {
                System.out.println(name.getName());
            }
        } else {
            for (Song name : songs) {
                if (input.equals(name.getType())) {
                    System.out.println(name.getName());
                }
            }
        }
    }
}
