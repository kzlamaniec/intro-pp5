package pl.kzlamaniec.cc.factory;

class Boss implements Employee {
    private final String name;
    private final Worker worker;

    Boss(String name, Worker worker) {
        this.name = name;
        this.worker = worker;
    }

    @Override
    public Product doWork() {
        return worker.doWork();
    }

}
