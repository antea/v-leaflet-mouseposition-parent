package org.vaadin.addon.leaflet.mouseposition;

import org.vaadin.addon.leaflet.control.AbstractDefaultControl;
import org.vaadin.addon.leaflet.mouseposition.client.MousePositionState;

public class LMousePosition extends AbstractDefaultControl {
    public LMousePosition() {
    }

    public LMousePosition(String latPrefix, String lonPrefix) {
        setLatPrefix(latPrefix);
        setLonPrefix(lonPrefix);
    }

    public void setLonPrefix(String lonPrefix) {
        getState().lonPrefix = lonPrefix;
    }

    public void setLatPrefix(String latPrefix) {
        getState().latPrefix = latPrefix;
    }

    @Override
    protected MousePositionState getState() {
        return (MousePositionState) super.getState();
    }
}
