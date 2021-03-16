public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        Subscriber1 s1 = new Subscriber1(newsStation);
        Subscriber2 s2 = new Subscriber2(newsStation);
        Subscriber3 s3 = new Subscriber3(newsStation);

        newsStation.setArticle("Design Patterns");
        newsStation.setArticle("Observer Patterns");
    }
}
