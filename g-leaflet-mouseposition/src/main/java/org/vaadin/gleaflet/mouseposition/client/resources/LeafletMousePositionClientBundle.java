package org.vaadin.gleaflet.mouseposition.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Federico Russo
 */
public interface LeafletMousePositionClientBundle extends ClientBundle {

    @Source("L.Control.MousePosition.js")
    TextResource mousePositionScript();

    @Source("L.Control.MousePosition.css")
    @CssResource.NotStrict
    CssResource mousePositionStyle();
}
