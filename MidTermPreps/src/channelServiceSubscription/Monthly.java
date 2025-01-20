package channelServiceSubscription;

public class Monthly extends Service{
    @Override
    public int calcFee() {
        return getDailyPrice() * 30;
    }
}
