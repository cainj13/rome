package com.rometools.rome.unittest;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.io.impl.DateParser;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestSyndfeedRss20WithValidatingSyndFeed extends TestSyndFeedRSS20 {

    public TestSyndfeedRss20WithValidatingSyndFeed() {
        super("rss_2.0");
    }

    protected TestSyndfeedRss20WithValidatingSyndFeed(final String type) {
        super(type);
    }

    protected TestSyndfeedRss20WithValidatingSyndFeed(final String feedType, final String feedFileName) {
        super(feedType, feedFileName);
    }

    protected void testItem(final int i) throws Exception {
        super.testItem(i);
        final List<SyndEntry> items = this.getCachedSyndFeed().getEntries();
        final SyndEntry entry = items.get(i);
        this.get
        assertProperty(entry.getContents().get(0).getValue(), "channel.item[" + i + "].content");
    }

    @Override
    public void testPublishedDate() throws Exception {
        final Date d = DateParser.parseRFC822("Mon, 01 Jan 2001 00:00:00 GMT", Locale.US);
        assertEquals(this.getCachedSyndFeed().getPublishedDate(), d);
    }
}