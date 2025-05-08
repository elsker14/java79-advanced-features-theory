package com.javaremotero79.part4_generic.generic_interface.summary;

import java.time.LocalDateTime;

public class WatchProcessorImpl implements WatchProcessor{
    @Override
    public void registerWatchesStock(LocalDateTime arrivalTimestamp) {

    }

    @Override
    public boolean verifyStockIntegrity(LocalDateTime updateTimestamp) {
        return false;
    }

    @Override
    public String generateReceiptId(LocalDateTime receiptTimestamp) {
        return "";
    }
}
