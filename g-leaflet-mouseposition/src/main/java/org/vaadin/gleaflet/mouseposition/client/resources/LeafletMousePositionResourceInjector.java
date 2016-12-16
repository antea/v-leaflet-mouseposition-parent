package org.vaadin.gleaflet.mouseposition.client.resources;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

import com.google.gwt.core.client.GWT;

public class LeafletMousePositionResourceInjector {

    protected static LeafletMousePositionClientBundle bundle;

    public static void ensureInjected() {
        if (bundle == null) {
            LeafletResourceInjector.ensureInjected();
            bundle = GWT.create(LeafletMousePositionClientBundle.class);
            LeafletMousePositionResourceInjector injector = GWT
                    .create(LeafletMousePositionResourceInjector.class);
            injector.injectResources();
        }
    }

    /**
     * Override this with deferred binding to customize injected stuff
     */
    protected void injectResources() {
        ScriptInjector.fromString(bundle.mousePositionScript().getText()).setWindow(nativeTopWindow()).inject();
        ScriptInjector.fromString(bundle.mousePositionStyle().getText()).setWindow(nativeTopWindow()).inject();
    }

    private static native JavaScriptObject nativeTopWindow()
    /*-{
        return $wnd;
    }-*/;

}
