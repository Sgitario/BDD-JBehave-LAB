package com.sgitario.jbehave.bmicalculator.embedders.eclipse;

import java.io.File;

public class EclipseStoryLauncher {

        // --- Constants -----------------------------------------------------------
        
        private static final String STORY_EXTENSION = ".story";
        private static final String STORY_CONTAINER_NAME = "stories"
                        + File.separator;
        private static final String SLASH = "/";
        private static final String BACK_SLASH = "\\";

        // -- Methods (Main) -------------------------------------------------------
        
        public static void main(String[] args) throws Throwable {
                String filePath = args[0];
                System.out.println("Chosen file = " + filePath);

                if (isValidStoryLocation(filePath)) {
                        // prepare story relative path
                        String storyRelativePath = prepareStoryPath(filePath);

                        // create eclipse embedder
                        EclipseEmbedder eclipseEmbedder = EclipseEmbedderFactory.instance()
                                        .createEclipseEmbedder();

                        // launch a story
                        eclipseEmbedder.runStory(storyRelativePath);
                } else {
                        System.err.println("Invalid path to a story: " + filePath);
                }
        }

        // --- Methods (Auxiliary) -------------------------------------------------
        
        private static boolean isValidStoryLocation(String filePath) {
                return (filePath != null) && (filePath.endsWith(STORY_EXTENSION))
                                && filePath.indexOf(STORY_CONTAINER_NAME) > -1;
        }

        private static String prepareStoryPath(String filePath) {
                String storyRelativePath = filePath.substring(filePath
                                .indexOf(STORY_CONTAINER_NAME) + STORY_CONTAINER_NAME.length());
                storyRelativePath = storyRelativePath.replace(BACK_SLASH, SLASH);

                System.out.println("Story path for use: " + storyRelativePath);

                return storyRelativePath;
        }
}
