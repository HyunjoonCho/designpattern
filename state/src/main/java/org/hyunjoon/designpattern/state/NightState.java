package org.hyunjoon.designpattern.state;

public class NightState implements State {
    private static final NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (12 <= hour && hour < 13) {
            context.changeState(LunchState.getInstance());
        } else if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("ALERT! Safe Used during Nighttime");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alert Call (Nighttime)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Record Call (Nighttime)");
    }

    @Override
    public String toString() {
        return "[Nighttime]";
    }
}
