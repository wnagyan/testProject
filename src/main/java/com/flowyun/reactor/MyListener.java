package com.flowyun.reactor;

public interface MyListener<T> {
    // 监听新事件
    void newEvent(EventSource.Event event);
    // 监听事件源的终止
    void eventSourceStopped();
}

