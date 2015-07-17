package com.rometools.rome.unittest;

public class TestRSS20ValidatingSyndFeedRSS20 extends SyndFeedTest {

    protected TestRSS20ValidatingSyndFeedRSS20() {
        super("rss_2.0");
    }

    public TestRSS20ValidatingSyndFeedRSS20(String feedType) {
        super(feedType);
    }

    public TestRSS20ValidatingSyndFeedRSS20(String feedType, String feedFileName) {
        super(feedType, feedFileName);
    }

    @Override
    public void testPublishedDate() throws Exception {
        super.testPublishedDate();
    }
}