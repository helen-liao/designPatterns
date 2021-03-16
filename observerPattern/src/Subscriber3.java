public class Subscriber3 implements Observer, Display{
    private Subject newsStation;
    private String title;

    public Subscriber3(Subject newsStation) {
        this.newsStation = newsStation;
        newsStation.attach(this);
    }

    @Override
    public void update(String title) {
        this.title = title;
        displayArticleTitle();
    }

    @Override
    public void displayArticleTitle() {
        System.out.println("Subscriber3 ::: New article published : " + this.title);
    }
}
