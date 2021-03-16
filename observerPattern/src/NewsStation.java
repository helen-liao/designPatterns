import java.util.ArrayList;
import java.util.List;

public class NewsStation implements Subject{

    List<Observer> observer = new ArrayList<>();
    private String title;

    public void setArticle(String title){
        this.title = title;
        newArticlePublished();
    }

    public void newArticlePublished() {
        notifyUpdate();
    }

    @Override
    public void attach(Observer o) {
        observer.add(o);
    }

    @Override
    public void detach(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for (Observer o: observer)
            o.update(title);
    }
}
