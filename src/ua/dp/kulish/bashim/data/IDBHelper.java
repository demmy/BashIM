package ua.dp.kulish.bashim.data;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      05.08.13
 */
public interface IDBHelper {

    //база и таблицы
    public static final String DB_NAME = "database";
    public static final int DB_VERSION = 1;
    public static final String QUOTES_TABLE_NAME = "Quotes";

    //столбцы в Quotes
    public static final String COL_QUOTES_ID = "_id";
    public static final String COL_QUOTES_RATING = "rating";
    public static final String COL_QUOTES_TEXT = "text";
    public static final String COL_QUOTES_FAV = "favorite";

    //номера столбцов в Quotes
    public static final int NUM_COL_QUOTES_ID = 0;
    public static final int NUM_COL_QUOTES_RATING = 1;
    public static final int NUM_COL_QUOTES_TEXT = 2;
    public static final int NUM_COL_QUOTES_FAV = 3;
}
