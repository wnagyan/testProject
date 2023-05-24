package com.flowyun.reactor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventSource {

    private List<MyListener> listeners;

    public EventSource() {
        this.listeners = new ArrayList<>();
    }

    public void register(MyListener listener){
        listeners.add(listener);
    }

    public void newEvent(Event event){
        for (MyListener listener : listeners) {
            listener.newEvent(event);
        }
    }

    public void eventStopped(){
        for (MyListener listener : listeners) {
            listener.eventSourceStopped();
        }
    }

    @Data
    @AllArgsConstructor
    public static class Event{
        private Date time;
        private String msg;
    }
}
