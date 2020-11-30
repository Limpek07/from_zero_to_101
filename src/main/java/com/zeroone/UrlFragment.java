package com.zeroone;

public class UrlFragment {
    private static final String SEARCH_RESULTS_PAGE = "/courses/search/?q=";
    private static final String BUSINESS_COURSES_PAGE = "/courses/business/";


    public static String returnUrlFragment(String page) {
        String result = "";
        switch (page) {
            case "business courses":
                result = BUSINESS_COURSES_PAGE;
                break;
            case "search results page":
                result = SEARCH_RESULTS_PAGE;
                break;
        }
        return result;
    }
}
