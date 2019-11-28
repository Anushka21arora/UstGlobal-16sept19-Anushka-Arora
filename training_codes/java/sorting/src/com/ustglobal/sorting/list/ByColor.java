package com.ustglobal.sorting.list;

import java.util.Comparator;

public class ByColor implements Comparator<Marker>{
@Override
public int compare(Marker o1, Marker o2) {
	return o1.color.compareTo(o2.color);
}
}
