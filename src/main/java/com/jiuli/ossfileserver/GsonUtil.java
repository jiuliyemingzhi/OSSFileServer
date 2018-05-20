package com.jiuli.ossfileserver;

import com.google.gson.Gson;

public class GsonUtil {
    private static Gson gson;

    public static Gson getGson() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }
}
