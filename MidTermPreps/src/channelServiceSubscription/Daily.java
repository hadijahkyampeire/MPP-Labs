package channelServiceSubscription;

import java.time.LocalDate;

public class Daily extends Service{
    public Daily(int dailyPrice, LocalDate dateSubscribed) {
        super(dailyPrice, dateSubscribed);
    }

    @Override
    public int calcFee() {
        return getDailyPrice() * dateDifference();
    }
}
