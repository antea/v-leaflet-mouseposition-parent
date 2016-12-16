package org.vaadin.addon.leaflet.mouseposition.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractControlConnector;
import org.vaadin.addon.leaflet.mouseposition.LMousePosition;
import org.vaadin.gleaflet.mouseposition.client.MousePosition;
import org.vaadin.gleaflet.mouseposition.client.resources.LeafletMousePositionResourceInjector;

@Connect(LMousePosition.class)
public class LeafletMousePositionConnector<T> extends AbstractControlConnector<MousePosition> {

    static {
        LeafletMousePositionResourceInjector.ensureInjected();
    }

    @Override
    protected MousePosition createControl() {
        return MousePosition.create(getMap());
    }
}
