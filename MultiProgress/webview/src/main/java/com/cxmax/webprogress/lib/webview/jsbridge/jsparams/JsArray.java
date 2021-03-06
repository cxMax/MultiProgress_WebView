package com.cxmax.webprogress.lib.webview.jsbridge.jsparams;


import com.cxmax.webprogress.lib.webview.jsbridge.entity.JsCallback;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 2018/11/20.
 */
public interface JsArray extends JsObject{
    int size();

    boolean isEmpty();

    boolean isNull(int index);

    boolean getBoolean(int index);

    double getDouble(int index);

    int getInt(int index);

    long getLong(int index);

    String getString(int index);

    JsMap getMap(int index);

    JsArray getArray(int index);

    JsCallback getCallback(int index);

    int getType(int index);

    Object get(int index);
}
