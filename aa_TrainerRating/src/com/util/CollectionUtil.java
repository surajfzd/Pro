package com.util;

import java.time.LocalDate;
import java.util.HashMap;

import com.bean.Trainer;

public class CollectionUtil {
	static HashMap<Integer, Trainer> hm = new HashMap<Integer, Trainer>();

	public static HashMap<Integer, Trainer> getHm() {
		return hm;
	}

	public void setHm(HashMap<Integer, Trainer> hm) {
		this.hm = hm;
	}

	static {
		hm.put(41, new Trainer("Smitha", "Java", LocalDate.of(2000, 03, 13), LocalDate.of(2000, 03, 13), 5));
		hm.put(22, new Trainer("Smitha", "Java", LocalDate.of(2000, 03, 13), LocalDate.of(2000, 03, 13), 2));
		hm.put(43, new Trainer("Smitha", "Java", LocalDate.of(2000, 03, 13), LocalDate.of(2000, 03, 13), 3));
	}

}
