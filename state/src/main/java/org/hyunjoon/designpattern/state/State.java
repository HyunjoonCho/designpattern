package org.hyunjoon.designpattern.state;

public interface State {
    public void doClock(Context context, int hour);
    public void doUse(Context context);
    public void doAlarm(Context context);
    public void doPhone(Context context);
}
