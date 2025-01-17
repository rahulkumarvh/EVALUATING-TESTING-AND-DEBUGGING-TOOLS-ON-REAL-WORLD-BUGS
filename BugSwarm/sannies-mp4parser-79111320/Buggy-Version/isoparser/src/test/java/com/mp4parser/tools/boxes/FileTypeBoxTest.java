package com.mp4parser.tools.boxes;

import com.googlecode.mp4parser.boxes.BoxRoundtripTest;
import com.mp4parser.ParsableBox;
import com.mp4parser.boxes.iso14496.part12.FileTypeBox;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class FileTypeBoxTest extends BoxRoundtripTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {


        return Collections.singletonList(
                new Object[]{new FileTypeBox(),
                        new Map.Entry[]{
                                new E("majorBrand", "mp45"),
                                new E("minorVersion", 0x124334L),
                                new E("compatibleBrands", Arrays.asList("abcd", "hjkl"))}
                });
    }


    public FileTypeBoxTest(ParsableBox parsableBoxUnderTest, Map.Entry<String, Object>... properties) {
        super(parsableBoxUnderTest, properties);
    }
}