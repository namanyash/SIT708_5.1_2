package com.example.task5_1_2;

public class Property {
    private String title;
    private String uri;
    private String introLine;

    public Property(String title, String uri, String introLine) {
        this.title = title;
        this.uri = uri;
        this.introLine = introLine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getIntroLine() {
        return introLine;
    }

    public void setIntroLine(String introLine) {
        this.introLine = introLine;
    }
}
