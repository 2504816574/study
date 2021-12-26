package com.ashen.design.pattern.reactor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sdong
 * @description 输入对象，reactor模式中处理的原始输入对象
 * @date 2021/12/26 19:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputSource {
    private Object data;
    private long id;




}
