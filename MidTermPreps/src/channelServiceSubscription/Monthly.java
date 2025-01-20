package channelServiceSubscription;

public class Monthly extends Service{
    public Monthly(int dailyPrice) {
        super(dailyPrice);
    }

    @Override
    public int calcFee() {
        return getDailyPrice() * 30;
    }
}
