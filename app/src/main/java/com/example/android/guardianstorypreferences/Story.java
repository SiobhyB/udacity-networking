/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.guardianstorypreferences;

/**
 * An {@link Story} object contains information related to a single earthquake.
 */
public class Story {

    /** Publication date of the story */
    private String mPublicationDate;

    /** Title of the story */
    private String mTitle;

    /** Section of the story */
    private String mSection;

    /** URL to the story */
    private String mUrl;

    /** Author the story */
    private String mAuthor;

    /**
     * Constructs a new {@link Story} object.
     *
     * @param publicationDate is the publication date of the story
     * @param title is the title of the story
     * @param section is the section of the story
     * @param url is the URL to more info about the story
     */
    public Story(String publicationDate, String title, String section, String url, String author) {
        mPublicationDate = publicationDate;
        mTitle = title;
        mSection = section;
        mUrl = url;
        mAuthor = author;
    }

    /**
     * Returns the publication date of the story.
     */
    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the title of the story.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the story.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the website URL to find more information about the story.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the story.
     */
    public String getAuthor() {
        return mAuthor;
    }

}
