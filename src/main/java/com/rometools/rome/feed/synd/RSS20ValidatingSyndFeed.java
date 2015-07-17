package com.rometools.rome.feed.synd;

import java.util.Date;

/**
 * The RSS 2.0 Specification requires that EITHER a <code>date</code> element OR a <code>pubDate</code> element be present
 * for items on the feed.  Since both of the fields delegate to the same <code>DCModule</code> field, we need to split
 * them out so that they can be set and rendered seperately.
 */
public class RSS20ValidatingSyndFeed extends SyndFeedImpl {

    private Date publishedDate;

    @Override
    public Date getPublishedDate() {
        return new Date(publishedDate.getTime());
    }

    @Override
    public void setPublishedDate(final Date pubDate) {
        this.publishedDate = new Date(pubDate.getTime());
    }
}