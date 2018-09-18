package cn.jk.study.spring.annotation.filterType;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Created by jiakang on 2018/9/3.
 */
public class MyFilterType implements TypeFilter{
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        System.out.println("--->"+metadataReader.getClassMetadata().getClassName());
        if (metadataReader.getClassMetadata().getClassName().contains("BakService")) {
            return true;
        }
        return false;
    }
}
