package com.core;

public final class CustomImmutableClass {

    private final String name;
    private final String city;

    public CustomImmutableClass(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
