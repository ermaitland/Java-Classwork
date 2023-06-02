package com.ellie.persistance;

import java.util.LinkedList;

import com.ellie.dto.Single_DVD;

public interface LibraryDataAccess {
public boolean writeRecords(LinkedList<Single_DVD> dvds) throws Exception;
// 1) remove
}
