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

    public LMousePosition(String latPrefix, String lonPrefix, int numDigits) {
        this(latPrefix, lonPrefix);
        setNumDigits(numDigits);
    }

    public void setLonPrefix(String lonPrefix) {
        getState().lonPrefix = lonPrefix;
    }

    public void setLatPrefix(String latPrefix) {
        getState().latPrefix = latPrefix;
    }

    public void setNumDigits(int numDigits) {
        getState().numDigits = numDigits;
    }

    @Override
    protected MousePositionState getState() {
        return (MousePositionState) super.getState();
    }
}
