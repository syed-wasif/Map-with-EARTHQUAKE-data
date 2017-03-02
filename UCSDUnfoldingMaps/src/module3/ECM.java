package module3;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import java.util.*;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.marker.Marker;

public class ECM extends PApplet {
	
	private UnfoldingMap map;
	Map<String, Float> LE;
	List<Feature> countries;
	List<Marker> markers;
	
	
	public void setup() {
		size(950,600,OPENGL);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
		map.zoomToLevel(6);
	    MapUtils.createDefaultEventDispatcher(this, map);
	    LE = loadLEFromCSV("LifeExpectancyWorldBank.csv");
	}
	
	public void draw(){
		background(10);
		map.draw();
		
	}
	
	public Map<String, Float> loadLEFromCSV(String fileName){
		Map<String, Float> life  = new HashMap<String, Float>();
		String[] rows = loadStrings(fileName);
		for(String row: rows){
			String[] columns = row.split(",");
			float value = Float.parseFloat(columns[5]);
			life.put(columns[4], value);
		}
		return life;
		}					
	}
	


