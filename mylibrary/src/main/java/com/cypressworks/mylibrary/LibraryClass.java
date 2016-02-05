package com.cypressworks.mylibrary;

import android.content.Context;

public class LibraryClass {
    public String getName(Context c) {
        return c.getString(R.string.library_name);
    }
}
