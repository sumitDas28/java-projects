package com.github.sumitdas28.solid.depinversion.bad;

// high level module
public class DatabaseController {

    private MySQLDatabase mySQLDatabase;
    private OracleDatabase oracleDatabase;

    public DatabaseController(String type) {
        // tight binding when we program to a class (instead of an interface)
        if(type=="oracle"){
            oracleDatabase = new OracleDatabase();
            oracleDatabase.connect();
            oracleDatabase.disConnect();
        } else if (type=="mysql"){
            mySQLDatabase = new MySQLDatabase();
            mySQLDatabase.connect();
            mySQLDatabase.disConnect();
        }
    }
}
