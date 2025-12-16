package com.consultaapicep.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class GsonConfig {

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private GsonConfig() {}

    public static Gson getGson() {
        return GSON;
    }
}
