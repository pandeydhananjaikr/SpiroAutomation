package com.spiro.managers;

import com.spiro.fileReaders.PropertiesReaders;

public class ReaderManager {

    private static ReaderManager readerManager = new ReaderManager();
    private static PropertiesReaders propertiesReaders;

    private ReaderManager() {
    }

    public static ReaderManager getInstance() {
        return readerManager;
    }

    public PropertiesReaders getPropertiesReaders() {
        return (propertiesReaders == null) ? new PropertiesReaders() : propertiesReaders;
    }


}
