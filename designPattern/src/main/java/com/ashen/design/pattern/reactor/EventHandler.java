package com.ashen.design.pattern.reactor;

/**
 * @author sdong
 * @description event处理器的抽象类
 * @date 2021/12/26 19:58
 */
public abstract class EventHandler {

    private InputSource source;

    public abstract void handle(Event event);

    public InputSource getSource() {
        return source;
    }

    public void setSource(InputSource source) {
        this.source = source;
    }
}