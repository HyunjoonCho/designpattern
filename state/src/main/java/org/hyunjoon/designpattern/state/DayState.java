package org.hyunjoon.designpattern.state;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (12 <= hour && hour < 13) {
            context.changeState(LunchState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Safe Used (Daytime)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alert Call (Daytime)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Normal Call (Daytime");
    }

    @Override
    public String toString() {
        return "[Daytime]";
    }
}
