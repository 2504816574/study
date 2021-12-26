package com.ashen.design.pattern.reactor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sdong
 * @description  reactor模式中内部处理的event类
 * @date 2021/12/26 19:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private InputSource source;
    private EventType type;
}
