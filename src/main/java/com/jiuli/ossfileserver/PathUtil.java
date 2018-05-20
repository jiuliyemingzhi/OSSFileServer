package com.jiuli.ossfileserver;

import java.io.File;

public class PathUtil {
    private static final ClassLoader classLoader = PathUtil.class.getClassLoader();

    public static String getImageBasePath() {
        String os = System.getProperty("os.name");
        String basePath;
        if (os.toLowerCase().startsWith("win")) {
            basePath = "C:/Users/r1907/warehouse";
        } else {
            basePath = "/home/workspace/warehouse";
        }
        basePath = basePath.replace("/", File.separator);
        return basePath;
    }

    public static String getSourcePath(String name) {
        return classLoader.getResource(name).getPath();
    }
}
