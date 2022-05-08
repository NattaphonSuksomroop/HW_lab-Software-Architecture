import java.util.ArrayList;

public class NewsPublisher implements Publishable {
    private ArrayList<NewsSubscriber> newsSubscriberList = new ArrayList<>();

    @Override
    public void subscribe(NewsSubscriber newsSubscriber){
        this.newsSubscriberList.add(newsSubscriber);
    }

    @Override
    public void publish(News news){
        for(NewsSubscriber newsSubscriber : newsSubscriberList){
            newsSubscriber.update(news.getContent());
        }
    }

}