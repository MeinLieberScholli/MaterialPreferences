package com.yarolegovich.mp.io;

import android.content.Context;

import java.util.Set;

/**
 * Created by yarolegovich on 05.05.2016.
 */
public interface UserInputModule {

    void showEditTextInput(
            String key,
            CharSequence title,
            CharSequence defaultValue,
            Listener<String> listener);

    void showSingleChoiceInput(
            String key,
            CharSequence title,
            CharSequence[] displayItems,
            CharSequence[] values,
            int selected,
            Listener<String> listener);

    void showMultiChoiceInput(
            String key,
            CharSequence title,
            CharSequence[] displayItems,
            CharSequence[] values,
            boolean[] defaultSelection,
            Listener<Set<String>> listener);

    interface Factory {
        UserInputModule create(Context context);
    }

    interface Listener<T> {
        void onInput(T value);
    }
}
