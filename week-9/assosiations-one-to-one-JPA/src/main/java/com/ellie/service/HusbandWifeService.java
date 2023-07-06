package com.ellie.service;

import com.ellie.dto.entity.Husband;
import com.ellie.dto.entity.Wife;

public interface HusbandWifeService {
	public void addHusband(Husband husband);
	public void addWife(Wife wife);
	public Husband searchHusbandById(int hId);
	public Wife searchWifeById(String wId);
}
