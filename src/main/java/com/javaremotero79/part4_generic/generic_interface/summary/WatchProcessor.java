package com.javaremotero79.part4_generic.generic_interface.summary;

import java.time.LocalDateTime;

public interface WatchProcessor {

    void registerWatchesStock(LocalDateTime arrivalTimestamp);
    boolean verifyStockIntegrity(LocalDateTime updateTimestamp);
    String generateReceiptId(LocalDateTime receiptTimestamp);
}
