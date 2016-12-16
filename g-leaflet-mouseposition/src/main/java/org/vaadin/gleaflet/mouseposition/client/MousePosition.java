package org.vaadin.gleaflet.mouseposition.client;


import org.peimari.gleaflet.client.Map;
import org.peimari.gleaflet.client.control.Control;

public class MousePosition extends Control {

    protected MousePosition() {
    }

    public static native MousePosition create(Map map)
        /*-{
            var result = $wnd.L.control.mousePosition();
            result.addTo(map);
            return result;
        }-*/;

}
