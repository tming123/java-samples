package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 水果颜色注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    /**
     * 颜色枚举
     */
    public enum Color {
        BLUE, RED, GREEN
    }

    /**
     * 颜色属性
     *
     * @return
     */
    Color fruitColor() default Color.GREEN;
}
