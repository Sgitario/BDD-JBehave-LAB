package com.sgitario.jbehave.bmicalculator.embedders.eclipse;

import java.util.Arrays;

import org.jbehave.core.embedder.Embedder;

public class EclipseEmbedder extends Embedder {

    // --- Constants -----------------------------------------------------------

    private static final String STORY_FILE_EXTENSION = ".story";

    // --- Constructors --------------------------------------------------------

    public EclipseEmbedder() {
    }

    // --- Methods -------------------------------------------------------------

    /**
     * Used to launch a single story.
     * 
     * @param story
     */
    public void runStory(String story) {
            if (story != null && story.endsWith(STORY_FILE_EXTENSION)) {
                    this.runStoriesAsPaths(Arrays.asList(story));
                    generateReportsView();
            } else {
                    throw new RuntimeException("Problem locating .story file:" + story);
            }
    }
}