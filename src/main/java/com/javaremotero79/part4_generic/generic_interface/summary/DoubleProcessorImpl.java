package com.javaremotero79.part4_generic.generic_interface.summary;

public class DoubleProcessorImpl implements DoubleProcessor{
    @Override
    public void manipulateData(Double limit) {

    }

    @Override
    public boolean checkData(Double limit) {
        return false;
    }

    @Override
    public String stringifyData(Double limit) {
        return "";
    }
}
