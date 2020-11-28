package org.hyunjoon.designpattern.state;

public class LunchState implements State {
    private static final LunchState singleton = new LunchState();

    private LunchState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 && 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if((hour <= 9 && hour < 12) || (hour <=13 && hour < 17)) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("ALERT! Safe Used during Lunchtime");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alert Call (Lunchtime)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Record Call (Lunchtime)");
    }
}
