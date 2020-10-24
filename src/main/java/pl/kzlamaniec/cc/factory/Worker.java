package pl.kzlamaniec.cc.factory;

import java.util.UUID;

class Worker {
    Product doWork() {
        return new Product(UUID.randomUUID());
    }
}
