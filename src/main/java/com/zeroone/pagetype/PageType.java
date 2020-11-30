package com.zeroone.pagetype;

public enum PageType {
    BUSINESS_COURSES_PAGE("/courses/business/"),
    MAIN_PAGE("/"),
    SEARCH_RESULTS_PAGE("/courses/search/?q=");

    private final String urlFragment;

    PageType(String urlFragment) {
        this.urlFragment = urlFragment;
    }

    public String getUrlFragment() {
        return urlFragment;
    }
}
