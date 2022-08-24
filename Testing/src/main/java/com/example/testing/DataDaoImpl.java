package com.example.testing;

public class DataDaoImpl {
    public boolean submit(String nrp, String nama, String nilai ){
        return nrp.equals("2072051") && nama.equals("Nisa Deviani") &&
                nilai.equals("70");
    }
}
