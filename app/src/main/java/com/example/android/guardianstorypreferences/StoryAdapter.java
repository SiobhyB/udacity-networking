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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link StoryAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Story} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class StoryAdapter extends ArrayAdapter<Story> {

    /**
     * Constructs a new {@link StoryAdapter}.
     *
     * @param context of the app
     * @param stories is the list of stories, which is the data source of the adapter
     */
    public StoryAdapter(Context context, List<Story> stories) {
        super(context, 0, stories);
    }

    /**
     * Returns a list item view that displays information about the story at the given position
     * in the list of stories.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.story_list_item, parent, false);
        }

        // Find the story at the given position in the list of stories
        Story currentStory = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.story_title);
        TextView section = (TextView) listItemView.findViewById(R.id.story_section);
        TextView date = (TextView) listItemView.findViewById(R.id.story_date);
        TextView author = (TextView) listItemView.findViewById(R.id.story_author);

        title.setText(currentStory.getTitle());
        section.setText(currentStory.getSection());
        date.setText(currentStory.getPublicationDate());
        author.setText(currentStory.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
