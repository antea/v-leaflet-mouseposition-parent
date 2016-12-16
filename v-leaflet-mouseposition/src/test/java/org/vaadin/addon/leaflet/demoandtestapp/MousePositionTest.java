package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LTileLayer;
import org.vaadin.addon.leaflet.mouseposition.LMousePosition;
import org.vaadin.addonhelpers.AbstractTest;

public class MousePositionTest extends AbstractTest {

    @Override
    public Component getTestComponent() {

        LMap leafletMap = new LMap();

        Point p = new GeometryFactory().createPoint(new Coordinate(8.622, 45.819));

        leafletMap.setCenter(p);
        leafletMap.setZoomLevel(11);
        leafletMap.setMaxZoom(19);

        LTileLayer osm = new LTileLayer("http://{s}.tile.osm.org/{z}/{x}/{y}.png");
        osm.setAttributionString("&copy; <a href='http://osm.org/copyright'>OpenStreetMap</a> contributors");

        osm.setMaxZoom(18);
        osm.setDetectRetina(true);
        leafletMap.addBaseLayer(osm, "Open Street Map");

        leafletMap.addControl(new LMousePosition());

        return leafletMap;
    }
}
