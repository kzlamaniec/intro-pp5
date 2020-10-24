package pl.kzlamaniec.cc.factory;

import java.util.UUID;

public class Product {
    private final UUID uuid;

    public Product(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "I am product with id:" + uuid.toString();
    }
}