package com.example.store.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InventoryItem {
    String store_id;
    String product_id;
    LocalDate expiration_date;
    Long quantity;
    LocalDate received_date;
}
