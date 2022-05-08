public class NewsSubscriber implements Subscribable {
    private String name ;
    public NewsSubscriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String content) {
        System.out.println(getName() + " receives news : "+content);
    }
}
