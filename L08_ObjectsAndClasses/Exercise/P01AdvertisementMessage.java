package L08_ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    static class AdvertisementMessage {
        String phrase;
        String event;
        String author;
        String city;

        public String getPhrase() {
            return this.phrase;
        }

        public String getEvent() {
            return this.event;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getCity() {
            return this.city;
        }

        public AdvertisementMessage (String phrase, String event, String author, String city){
            this.phrase = phrase;
            this.event = event;
            this.author = author;
            this.city = city;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] eventsArr = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authorsArr = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] citiesArr = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Random rnd = new Random();

            String rndPhrase = phrasesArr[rnd.nextInt(phrasesArr.length)];
            String rndEvent = eventsArr[rnd.nextInt(eventsArr.length)];
            String rndAuthor = authorsArr[rnd.nextInt(authorsArr.length)];
            String rndCity = citiesArr[rnd.nextInt(citiesArr.length)];

            AdvertisementMessage currentAdvert = new AdvertisementMessage(rndPhrase,rndEvent,rndAuthor,rndCity);
            System.out.printf("%s %s %s – %s.%n", currentAdvert.getPhrase(), currentAdvert.getEvent(), currentAdvert.getAuthor(),currentAdvert.getCity());

        }


    }
}
