package org.helium.logging;

import org.slf4j.Marker;

import java.util.Iterator;

/**
 * Marker的设计规范
 * NAME
 * 1. AND
 * Created by Coral on 9/10/15.
 */
public class SimpleMarker implements Marker {
	private String name;
	public SimpleMarker(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void add(Marker reference) {
	}

	@Override
	public boolean remove(Marker reference) {
		return false;
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public boolean hasReferences() {
		return false;
	}

	@Override
	public Iterator<Marker> iterator() {
		return null;
	}

	@Override
	public boolean contains(Marker other) {
		return false;
	}

	@Override
	public boolean contains(String name) {
		return this.name.contains(name);
	}
}
