package cn.jk.study.spring.annotation.importConfig;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by jiakang on 2018/9/4.
 */
public class MyImportSelector implements ImportSelector{
    /**
     * @param importingClassMetadata 当前注解 @Import 的类的所有注解信息
     * @return 导入容器的组件全名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"cn.jk.study.spring.annotation.bean.Blue","cn.jk.study.spring.annotation.bean.Red"};
    }
}
