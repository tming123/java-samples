package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. @Retention @Target @Document @Inherited四种 是元注解即 “注解的注解”
// 2. @Target 表示该注解目标,可能的 ElemenetType 参数包括:
//    ElemenetType.CONSTRUCTOR 构造器声明
//    ElemenetType.FIELD 域声明(包括 enum 实例)
//    ElemenetType.LOCAL_VARIABLE 局部变量声明
//    ElemenetType.METHOD 方法声明
//    ElemenetType.PACKAGE 包声明
//    ElemenetType.PARAMETER 参数声明
//    ElemenetType.TYPE 类，接口(包括注解类型)或enum声明
//3. @Retention 表示该注解的生命周期,可选的 RetentionPolicy 参数包括：
//    RetentionPolicy.SOURCE 注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃注解将被编译器丢弃
//    RetentionPolicy.CLASS 注解被保留到class文件，但jvm加载class文件时候被遗弃
//    RetentionPolicy.RUNTIME 注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；，因此可以通过反射机制读取注解的信息
//4. @Documented 指示将此注解包含在 javadoc 中
//5. @Inherited 指示允许子类继承父类中的注解
//6. 使用注解需要遵守它的规则：
//    Annotation型定义为@interface, 所有的Annotation会自动继承java.lang.Annotation这一接口,并且不能再去继承别的类或是接口.
//    参数成员只能用public或默认(default)这两个访问权修饰
//    参数成员只能用基本类型byte,short,char,int,long,float,double,boolean八种基本数据类型和String、Enum、Class、annotations等数据类型,以及这一些类型的数组.
//    要获取类方法和字段的注解信息，必须通过Java的反射技术来获取 Annotation对象,因为你除此之外没有别的获取注解对象的方法（分为编译期还是运行期）

/**
 * 水果名称注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {
    String value() default "";
}
